package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;

/* renamed from: gg7  reason: default package */
public final class gg7 implements al {
    public static final gg7 q;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    /* JADX WARNING: type inference failed for: r0v0, types: [uf7, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = "https";
        obj.b = "max";
        obj.c = "api.oneme.ru";
        obj.d = "443";
        obj.e = "max.ru";
        obj.f = "api-test.oneme.ru";
        obj.g = "api-tg.oneme.ru";
        obj.h = "api";
        obj.i = "chat";
        obj.j = ConversationStartedStat.CALL_TYPE_JOIN;
        obj.k = ConversationStartedStat.CALL_TYPE_JOIN;
        obj.l = "joincall";
        obj.m = "u";
        obj.n = "stickerset";
        obj.o = "startapp";
        obj.p = ":folder";
        q = new gg7(obj);
    }

    public gg7(uf7 uf7) {
        this.a = uf7.a;
        this.b = uf7.b;
        this.c = uf7.c;
        this.d = uf7.d;
        this.e = uf7.e;
        this.f = uf7.f;
        this.g = uf7.g;
        this.h = uf7.h;
        this.i = uf7.i;
        this.j = uf7.j;
        this.k = uf7.k;
        this.l = uf7.l;
        this.m = uf7.m;
        this.n = uf7.n;
        this.o = uf7.o;
        this.p = uf7.p;
    }

    public final String a(String str) {
        return new Uri.Builder().scheme(this.a).authority(this.e).appendPath(str.replace("@", "")).build().toString();
    }

    public final List b(t52 t52, Uri uri) {
        fg7 c2 = c(uri, new tf7(this, 0));
        t52.e();
        ArrayList arrayList = null;
        for (i22 i22 : t52.h.values()) {
            try {
                String str = i22.b.I;
                if (TextUtils.isEmpty(str) ? false : c2.equals(c(Uri.parse(str), new tf7(this, 0)))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(i22);
                }
            } catch (Exception e2) {
                udd.t("t52", "exception in traverse predicate: %s", new Object[]{e2.getMessage()});
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[LOOP:0: B:12:0x002d->B:17:0x0045, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v5 int) binds: [B:11:0x002b, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fg7 c(android.net.Uri r6, v1b r7) {
        /*
            r5 = this;
            android.net.Uri r6 = r5.e(r6)
            java.util.List r6 = r6.getPathSegments()
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0016
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x002a
            boolean r7 = r7.test(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x002b
        L_0x0022:
            r7 = move-exception
            java.lang.String r2 = "gg7"
            java.lang.String r3 = "getLinkEntity: privacyPredicate fail"
            udd.s(r2, r3, r7)
        L_0x002a:
            r7 = r1
        L_0x002b:
            if (r7 == 0) goto L_0x0058
        L_0x002d:
            int r2 = r6.size()
            r3 = -1
            if (r1 >= r2) goto L_0x0048
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r5.j
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0045
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0048:
            r1 = r3
        L_0x0049:
            if (r1 == r3) goto L_0x0058
            int r5 = r6.size()
            if (r1 >= r5) goto L_0x0058
            java.lang.Object r5 = r6.get(r1)
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
        L_0x0058:
            fg7 r5 = new fg7
            r5.<init>(r0, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg7.c(android.net.Uri, v1b):fg7");
    }

    public final boolean d(Uri uri) {
        if (uri == null) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        boolean isEmpty = TextUtils.isEmpty(uri.getScheme());
        String str = this.g;
        String str2 = this.f;
        String str3 = this.e;
        if (!isEmpty) {
            String host = uri.getHost();
            if (uri.getScheme().equalsIgnoreCase(this.b)) {
                if (TextUtils.isEmpty(host) || pathSegments.size() <= 0) {
                    return false;
                }
                if (!host.equalsIgnoreCase(this.i) && !host.equalsIgnoreCase(this.h)) {
                    return false;
                }
            } else if (TextUtils.isEmpty(host) || pathSegments.size() <= 0) {
                return false;
            } else {
                if (!host.equalsIgnoreCase(str3) && !host.equalsIgnoreCase(str2) && !host.equalsIgnoreCase(str)) {
                    return false;
                }
            }
        } else if (pathSegments.isEmpty()) {
            return false;
        } else {
            String str4 = pathSegments.get(0);
            if (TextUtils.isEmpty(str4) || pathSegments.size() <= 1) {
                return false;
            }
            if (!str4.equalsIgnoreCase(str3) && !str4.equalsIgnoreCase(str2) && !str4.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public final Uri e(Uri uri) {
        String uri2 = uri.toString();
        boolean startsWith = uri2.startsWith(":");
        String str = this.b;
        if (!startsWith) {
            if (!uri2.startsWith(str + "://:")) {
                if (uri2.startsWith("@") || uri2.contains("://") || !TextUtils.isEmpty(uri.getScheme())) {
                    return uri;
                }
                return Uri.parse("https://" + uri);
            }
        }
        return am7.d(uri2.replace(str + "://:", ":"), str, (String) null);
    }
}
