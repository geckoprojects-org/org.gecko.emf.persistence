package org.gecko.emf.persistence.jpa.model.orm.provider;

import java.util.function.Supplier;

import org.gecko.emf.persistence.jpa.model.orm.EntityMappingsType;

public interface ORMappingProvider extends Supplier<EntityMappingsType> {

}
