package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: i0e  reason: default package */
public abstract class i0e extends xy6 {
    public static String D(String str) {
        List U = myc.U(h0e.g0(str));
        ArrayList arrayList = new ArrayList();
        for (Object next : U) {
            if (!h0e.c0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (!iu7.G(str2.charAt(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Integer num = (Integer) o23.g0(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        U.size();
        int A = p23.A(U);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = U.iterator();
        int i2 = 0;
        while (true) {
            String str3 = null;
            if (it2.hasNext()) {
                Object next2 = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str4 = (String) next2;
                    if (!(i2 == 0 || i2 == A) || !h0e.c0(str4)) {
                        if (intValue >= 0) {
                            int length3 = str4.length();
                            if (intValue <= length3) {
                                length3 = intValue;
                            }
                            str3 = str4.substring(length3);
                        } else {
                            throw new IllegalArgumentException(rf0.f(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                    }
                    if (str3 != null) {
                        arrayList3.add(str3);
                    }
                    i2 = i3;
                } else {
                    p23.G();
                    throw null;
                }
            } else {
                StringBuilder sb = new StringBuilder(length2);
                o23.b0(arrayList3, sb, 0, (u16) null, 124);
                return sb.toString();
            }
        }
    }

    public static String E(String str) {
        if (!h0e.c0("|")) {
            List U = myc.U(h0e.g0(str));
            int length = str.length();
            U.size();
            int A = p23.A(U);
            ArrayList arrayList = new ArrayList();
            Iterator it = U.iterator();
            int i = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str3 = (String) next;
                        if (!(i == 0 || i == A) || !h0e.c0(str3)) {
                            int length2 = str3.length();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    i3 = -1;
                                    break;
                                } else if (!iu7.G(str3.charAt(i3))) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (i3 != -1 && str3.startsWith("|", i3)) {
                                str2 = str3.substring(i3 + 1);
                            }
                            if (str2 == null) {
                                str2 = str3;
                            }
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                        i = i2;
                    } else {
                        p23.G();
                        throw null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(length);
                    o23.b0(arrayList, sb, 0, (u16) null, 124);
                    return sb.toString();
                }
            }
        } else {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
    }
}
