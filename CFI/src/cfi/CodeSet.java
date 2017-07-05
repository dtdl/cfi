package cfi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import cfi.base.ItemList;

public class CodeSet extends ItemList {
	
	protected List<Category> list;

	public CodeSet(String name, String description, List<Category> items) {
		super(name, description, items);
		// TODO Auto-generated constructor stub
	}

	public CodeSet(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public CodeSet(List<Category> items) {
		super(items);
		// TODO Auto-generated constructor stub
	}

	public CodeSet() {
		// TODO Auto-generated constructor stub
	}

	public int count() {
		int i = 0;
		for (Category category : this.list) {
			for (Group group : category.getList()) {
				i += group.getAttributeList1().size()
						* group.getAttributeList2().size()
						* group.getAttributeList3().size()
						* group.getAttributeList4().size();
			}
		}
		return i;
	}

	
	public void dumpCodeDescription(File file) {
		
		int i = 0;
		try {
			FileWriter writer = new FileWriter(file);
			for (Category category : this.list) {
				for (Group group : category.getList()) {
					for (Attribute attributeValue1 : group.getAttributeList1().getList()) {
						for (Attribute attributeValue2 : group.getAttributeList2().getList()) {
							for (Attribute attributeValue3 : group.getAttributeList3().getList()) {
								for (Attribute attributeValue4 : group.getAttributeList4().getList()) {
									String code = category.getName()
											+ group.getName()
											+ attributeValue1.getName()
											+ attributeValue2.getName()
											+ attributeValue3.getName()
											+ attributeValue4.getName();
									String description = category.getDescription() + "|"
											+ group.getDescription() + "|"
											+ attributeValue1.getDescription() + "|"
											+ attributeValue2.getDescription() + "|"
											+ attributeValue3.getDescription() + "|"
											+ attributeValue4.getDescription();
									writer.write(code + "|");
									writer.write(description + "\n");
									//System.out.println(code + " : " + description);
									i++;
								}
							}
						}
					}
				}
			}
			;
			System.out.println(i);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int size() {
		return this.list.size();
	}

	public void dumpINCLInsertStatement(File file) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			FileWriter writer = new FileWriter(file);
			for (Category category : this.list) {
				for (Group group : category.getList()) {
					for (Attribute attributeValue1 : group.getAttributeList1().getList()) {
						for (Attribute attributeValue2 : group.getAttributeList2().getList()) {
							for (Attribute attributeValue3 : group.getAttributeList3().getList()) {
								for (Attribute attributeValue4 : group.getAttributeList4().getList()) {
									String code = category.getName()
											+ group.getName()
											+ attributeValue1.getName()
											+ attributeValue2.getName()
											+ attributeValue3.getName()
											+ attributeValue4.getName();
									String description = category.getDescription() + "|"
											+ group.getDescription() + "|"
											+ attributeValue1.getDescription() + "|"
											+ attributeValue2.getDescription() + "|"
											+ attributeValue3.getDescription() + "|"
											+ attributeValue4.getDescription();
									String oid = "ACFI" + String.format("%06d", i+1);
									String sql = "Insert into FT_T_INCL (CLSF_OID, INDUS_CL_SET_ID, CL_VALUE, LEVEL_NUM, START_TMS, LAST_CHG_TMS, LAST_CHG_USR_ID, CL_NME) SELECT '" + oid + "', 'ASXCFI', '" + code + "', 1, sysdate, sysdate, 'ASX:CUSTOM', '" + description + "' FROM DUAL WHERE NOT EXISTS (SELECT 1 FROM ft_t_incl WHERE cl_value = '" + code + "' AND indus_cl_set_id = 'ASXCFI');";
									//writer.write(code + "|");
									writer.write(sql + "\n");
									//System.out.println(code + " : " + description);
									i++;
								}
							}
						}
					}
				}
			}
			;
			System.out.println(i);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
