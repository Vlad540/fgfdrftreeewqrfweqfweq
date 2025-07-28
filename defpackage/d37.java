package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: d37  reason: default package */
public final class d37 implements InvocationHandler {
    public boolean a;
    public String b;
    public final List c;

    public d37(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (hhd.f(name, "supports") && hhd.f(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (!hhd.f(name, "unsupported") || !hhd.f(Void.TYPE, returnType)) {
            boolean f = hhd.f(name, "protocols");
            List list = this.c;
            if (f && objArr.length == 0) {
                return list;
            }
            if ((hhd.f(name, "selectProtocol") || hhd.f(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 != null) {
                        List list2 = (List) obj2;
                        int size = list2.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list2.get(i);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!list.contains(str)) {
                                        if (i == size) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        this.b = str;
                                        return str;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = (String) list.get(0);
                        this.b = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((!hhd.f(name, "protocolSelected") && !hhd.f(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 != null) {
                this.b = (String) obj4;
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.a = true;
        return null;
    }
}
