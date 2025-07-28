package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dp4  reason: default package */
public final class dp4 {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public volatile gt0 e;
    public final Object f;

    public dp4(File file) {
        this.a = file;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            this.b = parentFile;
            this.c = ng5.N(parentFile, file.getName() + ".tmp");
            this.d = ng5.N(parentFile, file.getName() + ".taken");
            this.e = bp4.h;
            this.f = new Object();
            return;
        }
        throw new IllegalStateException(("File " + file + " not in directory").toString());
    }

    public final void a(List list) {
        List list2;
        if (!list.isEmpty()) {
            synchronized (this.f) {
                cp4 cp4 = this.e;
                if (!(cp4 instanceof cp4) || list != ((List) cp4.h.get())) {
                    ap4 ap4 = this.e;
                    if (ap4 instanceof bp4) {
                        list2 = b();
                    } else if (ap4 instanceof ap4) {
                        list2 = ap4.h;
                    } else if (ap4 instanceof cp4) {
                        list2 = hw4.a;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    List t = cqc.t(list2, list);
                    c(t);
                    this.e = new ap4(t);
                    return;
                }
                this.b.mkdirs();
                this.d.renameTo(this.a);
                this.e = new ap4(list);
            }
        }
    }

    public final List b() {
        File file = this.a;
        boolean exists = file.exists();
        hw4 hw4 = hw4.a;
        if (!exists) {
            return hw4;
        }
        try {
            JSONArray jSONArray = new JSONArray(ng5.M(file));
            lg7 c2 = hwf.c();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                c2.add(new fp4(jSONObject.getString("event"), jSONObject.getString("reason"), jSONObject.getInt("count")));
            }
            return hwf.a(c2);
        } catch (JSONException unused) {
            Objects.toString(file);
            try {
                h2g.h(file);
            } catch (IOException unused2) {
                Objects.toString(file);
            }
            return hw4;
        } catch (IOException unused3) {
            Objects.toString(file);
            return hw4;
        }
    }

    public final void c(List list) {
        File file = this.c;
        File file2 = this.a;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fp4 fp4 = (fp4) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", (Object) fp4.a);
            jSONObject.put("reason", (Object) fp4.b);
            jSONObject.put("count", fp4.c);
            jSONArray.put((Object) jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        try {
            h2g.t(this.b);
            ng5.O(file, jSONArray2);
            h2g.y(file, file2);
        } catch (IOException unused) {
            Objects.toString(file2);
            try {
                h2g.h(file2);
            } catch (IOException unused2) {
                Objects.toString(file2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List d() {
        /*
            r4 = this;
            gt0 r0 = r4.e
            boolean r1 = r0 instanceof defpackage.ap4
            if (r1 == 0) goto L_0x0014
            r1 = r0
            ap4 r1 = (defpackage.ap4) r1
            java.util.List r1 = r1.h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0014
            hw4 r4 = hw4.a
            return r4
        L_0x0014:
            boolean r0 = r0 instanceof defpackage.cp4
            if (r0 == 0) goto L_0x001b
            hw4 r4 = hw4.a
            return r4
        L_0x001b:
            java.lang.Object r0 = r4.f
            monitor-enter(r0)
            gt0 r1 = r4.e     // Catch:{ all -> 0x0029 }
            boolean r2 = r1 instanceof defpackage.bp4     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x002b
            java.util.List r1 = r4.b()     // Catch:{ all -> 0x0029 }
            goto L_0x0033
        L_0x0029:
            r4 = move-exception
            goto L_0x0063
        L_0x002b:
            boolean r2 = r1 instanceof defpackage.ap4     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0055
            ap4 r1 = (defpackage.ap4) r1     // Catch:{ all -> 0x0029 }
            java.util.List r1 = r1.h     // Catch:{ all -> 0x0029 }
        L_0x0033:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0029 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x004a
            java.io.File r2 = r4.a     // Catch:{ all -> 0x0029 }
            java.io.File r3 = r4.d     // Catch:{ all -> 0x0029 }
            r2.renameTo(r3)     // Catch:{ all -> 0x0029 }
            cp4 r2 = new cp4     // Catch:{ all -> 0x0029 }
            r2.<init>(r1)     // Catch:{ all -> 0x0029 }
            r4.e = r2     // Catch:{ all -> 0x0029 }
            goto L_0x0053
        L_0x004a:
            ap4 r2 = new ap4     // Catch:{ all -> 0x0029 }
            hw4 r3 = hw4.a     // Catch:{ all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            r4.e = r2     // Catch:{ all -> 0x0029 }
        L_0x0053:
            monitor-exit(r0)
            return r1
        L_0x0055:
            boolean r4 = r1 instanceof defpackage.cp4     // Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x005d
            hw4 r4 = hw4.a     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)
            return r4
        L_0x005d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            throw r4     // Catch:{ all -> 0x0029 }
        L_0x0063:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp4.d():java.util.List");
    }
}
