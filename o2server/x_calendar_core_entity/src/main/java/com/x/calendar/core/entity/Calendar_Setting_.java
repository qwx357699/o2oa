/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.calendar.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.calendar.core.entity.Calendar_Setting.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Dec 23 11:58:39 CST 2018")
public class Calendar_Setting_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Calendar_Setting,String> configCode;
    public static volatile SingularAttribute<Calendar_Setting,String> configName;
    public static volatile SingularAttribute<Calendar_Setting,String> configValue;
    public static volatile SingularAttribute<Calendar_Setting,String> description;
    public static volatile SingularAttribute<Calendar_Setting,String> id;
    public static volatile SingularAttribute<Calendar_Setting,Boolean> isLob;
    public static volatile SingularAttribute<Calendar_Setting,Boolean> isMultiple;
    public static volatile SingularAttribute<Calendar_Setting,Integer> orderNumber;
    public static volatile SingularAttribute<Calendar_Setting,String> selectContent;
    public static volatile SingularAttribute<Calendar_Setting,String> valueType;
}
