/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.meeting.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.meeting.core.entity.Building.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Dec 23 11:59:20 CST 2018")
public class Building_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Building,String> address;
    public static volatile SingularAttribute<Building,String> id;
    public static volatile SingularAttribute<Building,String> name;
    public static volatile SingularAttribute<Building,String> pinyin;
    public static volatile SingularAttribute<Building,String> pinyinInitial;
}
