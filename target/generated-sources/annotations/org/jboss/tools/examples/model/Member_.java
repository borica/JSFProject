package org.jboss.tools.examples.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.jboss.tools.examples.enumeration.GenderEnum;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Member.class)
public abstract class Member_ {

	public static volatile SingularAttribute<Member, String> phoneNumber;
	public static volatile SingularAttribute<Member, GenderEnum> gender;
	public static volatile SingularAttribute<Member, String> name;
	public static volatile SingularAttribute<Member, Long> id;
	public static volatile SingularAttribute<Member, String> email;

}

