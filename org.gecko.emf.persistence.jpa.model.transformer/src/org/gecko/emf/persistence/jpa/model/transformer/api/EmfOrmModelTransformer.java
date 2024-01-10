package org.gecko.emf.persistence.jpa.model.transformer.api;

public interface EmfOrmModelTransformer {

	org.gecko.emf.persistence.jpa.model.orm.EntityMappingsType transform(
			org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType entityMappingsType);

}
