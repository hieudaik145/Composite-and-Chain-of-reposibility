package test.common;

import java.lang.reflect.Field;

public class Support {

	@SuppressWarnings("deprecation")
    public static<V>  V validateFor(Class<?> clazz)  {
        
        V object;
        try {
            object = (V) clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields) {
                field.setAccessible(true);
                field.set(object, field.getName());
            }
            return object;
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return null;
    }
}
