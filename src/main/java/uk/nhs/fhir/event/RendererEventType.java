package uk.nhs.fhir.event;

public enum RendererEventType {
	EMPTY_TYPE_LINKS,
	MISNAMED_SNAPSHOT_CHOICE_NODE,
	DUPLICATE_CONSTRAINT_KEYS,
	MISSING_CARDINALITY,
	MISSING_TYPE_LINK,
	EXTENSION_FILE_NOT_FOUND,
	BINDING_WITHOUT_DESC_OR_URL,
	STAND_IN_BINDING_DESCRIPTION_NOT_REMOVED,
	CONSTRAINT_WITHOUT_CONDITION, 
	HL7_URL_WITHOUT_DSTU2, 
	LINK_WITH_LOGICAL_URL, 
	HL7_ORG_UK_HOST,
	COMPLEX_EXTENSION_WITH_CHILDREN,
	LINK_REFERENCES_ITSELF,
	MISSING_REFERENCED_NODE,
	FIXEDVALUE_WITH_LINKED_NODE,
	MISSING_TYPE_LINKS_KNOWN_ISSUE,
	UNRESOLVED_DISCRIMINATOR,
	SLICING_WITHOUT_DISCRIMINATOR,
	NO_DISCRIMINATORS_FOUND,
	FIX_MISSING_TYPE_LINK,
	MULTIPLE_MAPPINGS_SAME_KEY,
	IGNORABLE_MAPPING_ID,
	MULTIPLE_MAPPINGS_SAME_KEY_IGNORABLE,
	TYPELINK_STRING_WITH_PROFILE,
	RESOURCE_WITHOUT_SNAPSHOT,
	EMPTY_VALUE_SET,
	DEFAULT_TO_SIMPLE_EXTENSION,
	METADATA_NOT_AVAILABLE,
	VERSION_NOT_AVAILABLE;
}