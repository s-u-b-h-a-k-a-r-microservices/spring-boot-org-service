package org.subhakar.services.organization.repository;

import org.springframework.data.repository.CrudRepository;
import org.subhakar.services.organization.model.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, String> {

}
