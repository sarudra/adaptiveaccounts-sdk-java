/**
 * Auto generated code
 * Business Types
 */
package com.paypal.svcs.types.aa;

public enum BusinessType {

ASSOCIATION("ASSOCIATION"),
CORPORATION("CORPORATION"),
GENERALPARTNERSHIP("GENERAL_PARTNERSHIP"),
GOVERNMENT("GOVERNMENT"),
INDIVIDUAL("INDIVIDUAL"),
LIMITEDLIABILITYPARTNERSHIP("LIMITED_LIABILITY_PARTNERSHIP"),
LIMITEDLIABILITYPRIVATECORPORATION("LIMITED_LIABILITY_PRIVATE_CORPORATION"),
LIMITEDLIABILITYPROPRIETORS("LIMITED_LIABILITY_PROPRIETORS"),
LIMITEDPARTNERSHIP("LIMITED_PARTNERSHIP"),
LIMITEDPARTNERSHIPPRIVATECORPORATION("LIMITED_PARTNERSHIP_PRIVATE_CORPORATION"),
NONPROFIT("NONPROFIT"),
OTHERCORPORATEBODY("OTHER_CORPORATE_BODY"),
PARTNERSHIP("PARTNERSHIP"),
PRIVATECORPORATION("PRIVATE_CORPORATION"),
PRIVATEPARTNERSHIP("PRIVATE_PARTNERSHIP"),
PROPRIETORSHIP("PROPRIETORSHIP"),
PROPRIETORSHIPCRAFTSMAN("PROPRIETORSHIP_CRAFTSMAN"),
PROPRIETARYCOMPANY("PROPRIETARY_COMPANY"),
PUBLICCOMPANY("PUBLIC_COMPANY"),
PUBLICCORPORATION("PUBLIC_CORPORATION"),
PUBLICPARTNERSHIP("PUBLIC_PARTNERSHIP"),
	;
private String value;
BusinessType(String val){
value=val;
}public String getValue(){
return value;
}
public static BusinessType fromValue(String v) {
		for (BusinessType c : values())
			if (c.value.equals(v))
				return c;
throw new IllegalArgumentException(v);
}
}