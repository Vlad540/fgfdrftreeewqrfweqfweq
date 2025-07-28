package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;

/* renamed from: qna  reason: default package */
public final class qna {
    public static final String[] d = {"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] e = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] f = {"android.permission.READ_CONTACTS"};
    public static final String[] g = {"android.permission.WRITE_CONTACTS"};
    public static final String[] h = {"android.permission.RECORD_AUDIO"};
    public static final String[] i = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
    public static final String[] j = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] k = {"android.permission.POST_NOTIFICATIONS"};
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o = {"android.permission.USE_FULL_SCREEN_INTENT"};
    public static final String[] p = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    public final Context a;
    public final x0f b;
    public final otf c;

    static {
        String[] strArr;
        String[] strArr2 = {"android.permission.CAMERA"};
        l = strArr2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i2 >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else {
            knc.a.getClass();
            strArr = jnc.c;
        }
        m = strArr;
        int length = strArr.length;
        Object[] copyOf = Arrays.copyOf(strArr, length + 1);
        System.arraycopy(strArr2, 0, copyOf, length, 1);
        n = (String[]) copyOf;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [otf, java.lang.Object] */
    public qna(Context context, x0f x0f) {
        this.a = context;
        this.b = x0f;
        ? obj = new Object();
        obj.a = context;
        obj.b = new r7e(new qk8(23, obj));
        this.c = obj;
    }

    public static boolean i(jrf jrf, String[] strArr) {
        for (String f2 : strArr) {
            if (jrf.f(f2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [int] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(jrf r5, java.lang.String[] r6, int[] r7, int r8, int r9) {
        /*
            ds r0 = new ds
            ke r1 = new ke
            r2 = 1
            r1.<init>(r2, r6)
            r6 = 2
            r0.<init>(r6, r1)
            r6 = 10
            int r6 = q23.H(r0, r6)
            int r6 = ju7.S(r6)
            r1 = 16
            if (r6 >= r1) goto L_0x001b
            r6 = r1
        L_0x001b:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r6)
            java.util.Iterator r6 = r0.iterator()
        L_0x0024:
            r0 = r6
            gp4 r0 = (gp4) r0
            java.util.Iterator r2 = r0.b
            boolean r2 = r2.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0049
            java.lang.Object r0 = r0.next()
            uv6 r0 = (uv6) r0
            int r2 = r0.a
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            r2 = r7[r2]
            if (r2 != 0) goto L_0x0041
            r3 = 1
        L_0x0041:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1.put(r0, r2)
            goto L_0x0024
        L_0x0049:
            java.lang.String r6 = "android.permission.READ_MEDIA_VIDEO"
            java.lang.Object r7 = r1.get(r6)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = hhd.f(r7, r0)
            if (r7 == 0) goto L_0x0064
            java.lang.String r7 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.Object r7 = r1.get(r7)
            boolean r7 = hhd.f(r7, r0)
            if (r7 == 0) goto L_0x0064
            goto L_0x0090
        L_0x0064:
            java.lang.String r7 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            java.lang.Object r7 = r1.get(r7)
            boolean r7 = hhd.f(r7, r0)
            if (r7 == 0) goto L_0x0071
            goto L_0x0090
        L_0x0071:
            jnc r7 = defpackage.knc.a
            r7.getClass()
            java.lang.String[] r7 = defpackage.jnc.c
            int r0 = r7.length
        L_0x0079:
            if (r3 >= r0) goto L_0x0090
            r2 = r7[r3]
            java.lang.Object r2 = r1.get(r6)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = hhd.f(r2, r4)
            if (r2 != 0) goto L_0x008d
            r5.g(r8, r9)
            goto L_0x0090
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0079
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.j(jrf, java.lang.String[], int[], int, int):void");
    }

    public static boolean k(jrf jrf, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        for (String a0 : strArr2) {
            int a02 = cs.a0(strArr, a0);
            Integer valueOf = Integer.valueOf(a02);
            if (a02 < 0) {
                valueOf = null;
            }
            if (valueOf == null || iArr[valueOf.intValue()] != 0) {
                if (i(jrf, strArr2)) {
                    udd.q("qna", "some permissions denied");
                } else {
                    jrf.g(i2, i3);
                    udd.q("qna", "some permissions denied forever");
                }
                return false;
            }
        }
        udd.q("qna", "all permissions granted");
        return true;
    }

    public final boolean a(boolean z, jrf jrf) {
        if (b(i)) {
            return true;
        }
        String[] strArr = h;
        if (!z && b(strArr)) {
            return true;
        }
        if (!z) {
            f(jrf, strArr, 178);
        } else {
            String[] strArr2 = l;
            Object[] copyOf = Arrays.copyOf(strArr, 2);
            System.arraycopy(strArr2, 0, copyOf, 1, 1);
            f(jrf, (String[]) copyOf, 178);
        }
        return false;
    }

    public final boolean b(String[] strArr) {
        for (String d2 : strArr) {
            if (d8.d(this.a, d2) != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        if (!b(m)) {
            return Build.VERSION.SDK_INT >= 34 ? b(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) : false;
        }
    }

    public final void d(jrf jrf, String[] strArr, int i2, int i3, int i4, int i5) {
        otf otf = this.c;
        otf.getClass();
        int length = strArr.length;
        boolean z = false;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z = true;
                break;
            }
            if (!((SharedPreferences) ((r7e) otf.b).getValue()).getBoolean(strArr[i6].concat("_req"), false)) {
                break;
            }
            i6++;
        }
        if ((!z) || i(jrf, strArr)) {
            jrf.c(strArr, i2, i4, i3, i5);
        } else {
            f(jrf, strArr, i2);
        }
    }

    public final void e(jrf jrf) {
        d(jrf, e, 156, iub.permissions_contacts_request_rationale, iub.permissions_contacts_request, iub.permissions_dialog_enable_access);
    }

    public final void f(jrf jrf, String[] strArr, int i2) {
        jrf.e(i2, strArr);
        SharedPreferences.Editor edit = ((SharedPreferences) ((r7e) this.c.b).getValue()).edit();
        for (String str : strArr) {
            edit.putBoolean(str + "_req", true);
        }
        edit.apply();
    }

    public final void g(jrf jrf) {
        String[] strArr = l;
        int i2 = iub.permissions_camera_request_photo;
        int i3 = baa.a;
        int i4 = baa.g;
        if (i(jrf, strArr)) {
            jrf.c(strArr, 158, i3, i2, i4);
        } else {
            f(jrf, strArr, 158);
        }
    }

    public final void h(jrf jrf) {
        String[] strArr = l;
        int i2 = iub.permissions_camera_request_video;
        int i3 = baa.a;
        int i4 = baa.g;
        if (i(jrf, strArr)) {
            jrf.c(strArr, 159, i3, i2, i4);
        } else {
            f(jrf, strArr, 159);
        }
    }
}
