package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: cs  reason: default package */
public abstract class cs extends pfa {
    public static dyc K(Object[] objArr) {
        return objArr.length == 0 ? pw4.a : new es(0, objArr);
    }

    public static boolean L(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (i == iArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        return i2 >= 0;
    }

    public static boolean M(long[] jArr, long j) {
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (j == jArr[i]) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    public static boolean N(Object[] objArr, Object obj) {
        return a0(objArr, obj) >= 0;
    }

    public static boolean O(Object[] objArr, Object[] objArr2) {
        Object[] objArr3 = objArr;
        Object[] objArr4 = objArr2;
        boolean z = true;
        if (objArr3 == objArr4) {
            return true;
        }
        if (objArr3 == null || objArr4 == null || objArr3.length != objArr4.length) {
            return false;
        }
        int length = objArr3.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr3[i];
            Object obj2 = objArr4[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if (!(obj instanceof Object[]) || !(obj2 instanceof Object[])) {
                    if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
                        if (!(obj instanceof short[]) || !(obj2 instanceof short[])) {
                            if (!(obj instanceof int[]) || !(obj2 instanceof int[])) {
                                if (!(obj instanceof long[]) || !(obj2 instanceof long[])) {
                                    if (!(obj instanceof float[]) || !(obj2 instanceof float[])) {
                                        if (!(obj instanceof double[]) || !(obj2 instanceof double[])) {
                                            if (!(obj instanceof char[]) || !(obj2 instanceof char[])) {
                                                if (!(obj instanceof boolean[]) || !(obj2 instanceof boolean[])) {
                                                    if ((obj instanceof ote) && (obj2 instanceof ote)) {
                                                        ((ote) obj).getClass();
                                                        ((ote) obj2).getClass();
                                                        if (!Arrays.equals((byte[]) null, (byte[]) null)) {
                                                            return false;
                                                        }
                                                    } else if ((obj instanceof rte) && (obj2 instanceof rte)) {
                                                        ((rte) obj).getClass();
                                                        ((rte) obj2).getClass();
                                                        if (!Arrays.equals((short[]) null, (short[]) null)) {
                                                            return false;
                                                        }
                                                    } else if ((obj instanceof pte) && (obj2 instanceof pte)) {
                                                        ((pte) obj).getClass();
                                                        ((pte) obj2).getClass();
                                                        if (!Arrays.equals((int[]) null, (int[]) null)) {
                                                            return false;
                                                        }
                                                    } else if ((obj instanceof qte) && (obj2 instanceof qte)) {
                                                        ((qte) obj).getClass();
                                                        ((qte) obj2).getClass();
                                                        if (!Arrays.equals((long[]) null, (long[]) null)) {
                                                            return false;
                                                        }
                                                    } else if (!obj.equals(obj2)) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if (!O((Object[]) obj, (Object[]) obj2)) {
                    return false;
                }
            }
            i++;
            z = true;
        }
        return z;
    }

    public static void P(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void Q(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void R(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static void S(byte[] bArr, int i, byte[] bArr2, int i2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    public static byte[] T(int i, byte[] bArr, int i2) {
        pfa.j(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static void U(float[] fArr, float f) {
        Arrays.fill(fArr, 0, fArr.length, f);
    }

    public static void V(long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
    }

    public static void W(Object[] objArr, Object obj) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    public static ArrayList X(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object Y(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Object Z(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int a0(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String b0(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u16 u16) {
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (u16 != null) {
                sb.append((CharSequence) u16.invoke(Long.valueOf(j)));
            } else {
                sb.append(String.valueOf(j));
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static String d0(Object[] objArr, String str, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(BuildConfig.FLAVOR);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(str);
            }
            xy6.a(sb, obj, (u16) null);
        }
        sb.append(BuildConfig.FLAVOR);
        return sb.toString();
    }

    public static final void e0(Object[] objArr, HashSet hashSet) {
        for (Object add : objArr) {
            hashSet.add(add);
        }
    }

    public static List f0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return hw4.a;
        }
        if (length == 1) {
            return Collections.singletonList(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List g0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new kr(objArr, false)) : Collections.singletonList(objArr[0]) : hw4.a;
    }

    public static Set h0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return qw4.a;
        }
        if (length == 1) {
            return Collections.singleton(Long.valueOf(jArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ju7.S(jArr.length));
        for (long valueOf : jArr) {
            linkedHashSet.add(Long.valueOf(valueOf));
        }
        return linkedHashSet;
    }
}
