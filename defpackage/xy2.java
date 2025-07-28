package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xy2  reason: default package */
public final class xy2 implements w67, vy2 {
    public static final Map b;
    public static final HashMap c;
    public static final LinkedHashMap o;
    public final Class a;

    static {
        List B = p23.B(s16.class, u16.class, i26.class, k26.class, m26.class, o26.class, p26.class, q26.class, r26.class, s26.class, t16.class, v16.class, w16.class, x16.class, y16.class, z16.class, a26.class, b26.class, c26.class, d26.class, f26.class, g26.class, h26.class);
        ArrayList arrayList = new ArrayList(q23.H(B, 10));
        int i = 0;
        for (Object next : B) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new wia((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                p23.G();
                throw null;
            }
        }
        b = ju7.V(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        for (String str : hashMap.values()) {
            hashMap3.put("kotlin.jvm.internal." + h0e.v0(str) + "CompanionObject", str + ".Companion");
        }
        for (Map.Entry entry : b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + intValue);
        }
        c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ju7.S(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), h0e.v0((String) entry2.getValue()));
        }
        o = linkedHashMap;
    }

    public xy2(Class cls) {
        this.a = cls;
    }

    public final Class a() {
        return this.a;
    }

    public final String b() {
        String str;
        Class cls = this.a;
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return h0e.u0(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return h0e.u0(simpleName, enclosingConstructor.getName() + '$');
            }
            int Z = h0e.Z(simpleName, '$', 0, false, 6);
            return Z == -1 ? simpleName : simpleName.substring(Z + 1, simpleName.length());
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = o;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        return str3 == null ? cls.getSimpleName() : str3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xy2) && mt0.p(this).equals(mt0.p((w67) obj));
    }

    public final int hashCode() {
        return mt0.p(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
