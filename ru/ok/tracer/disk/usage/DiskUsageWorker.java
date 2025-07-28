package ru.ok.tracer.disk.usage;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ei4", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1})
public final class DiskUsageWorker extends Worker {
    public final r7e b = new r7e(l8.c);

    public DiskUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String c(long j, LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject2.put(((da6) entry.getKey()).a, (Object) d((ei4) entry.getValue()));
        }
        jSONObject.put("consumers", (Object) jSONObject2);
        jSONObject.put("total_size", j);
        return jSONObject.toString();
    }

    public static JSONObject d(ei4 ei4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", ei4.a);
        jSONObject.put("name", (Object) ei4.b);
        if (ei4.c) {
            jSONObject.put("is_dir", true);
        }
        if (ei4.e) {
            jSONObject.put("is_overflow", true);
        }
        if (ei4.f) {
            jSONObject.put("is_excluded", true);
        }
        List<ei4> list = ei4.d;
        if (!list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (ei4 d : list) {
                arrayList.add(jSONArray.put((Object) d(d)));
            }
            jSONObject.put("children", (Object) jSONArray);
        }
        return jSONObject;
    }

    public static ei4 g(File file, int i, ArrayList arrayList) {
        boolean z;
        hw4<ei4> hw4;
        boolean z2;
        boolean z3;
        List list;
        int i2 = i;
        File file2 = file;
        ArrayList arrayList2 = arrayList;
        if (arrayList2.contains(file2)) {
            Objects.toString(file);
            return new ei4(0, file.getName(), false, (List) null, false, true, 28);
        } else if (!file.isDirectory()) {
            return new ei4(file.length(), file.getName(), false, (List) null, false, false, 60);
        } else {
            try {
                File parentFile = file.getParentFile();
                File file3 = parentFile == null ? file2 : new File(parentFile.getCanonicalFile(), file.getName());
                z = !hhd.f(file3.getCanonicalFile(), file3.getAbsoluteFile());
            } catch (IOException unused) {
                z = false;
            }
            if (z) {
                return new ei4(0, file.getName(), true, (List) null, false, false, 56);
            }
            File[] listFiles = file.listFiles();
            hw4 hw42 = hw4.a;
            if (listFiles != null) {
                hw4 = new ArrayList<>(listFiles.length);
                for (File g : listFiles) {
                    hw4.add(g(g, i2 + 1, arrayList2));
                }
            } else {
                hw4 = hw42;
            }
            long j = (long) 4096;
            long j2 = 0;
            for (ei4 ei4 : hw4) {
                j2 += ei4.a;
            }
            long j3 = j + j2;
            if (i2 > 6) {
                file.toString();
                z2 = true;
            } else {
                z2 = false;
                hw42 = hw4;
            }
            List m0 = o23.m0(hw42, new zo4(25));
            if (m0.size() > 20) {
                file.toString();
                list = m0.subList(0, 20);
                z3 = true;
            } else {
                z3 = z2;
                list = m0;
            }
            return new ei4(j3, file.getName(), true, list, z3, false, 32);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r0 = r0.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (kxb.b.i(r5) == 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final gh7 b() {
        /*
            r8 = this;
            x3a r1 = hwf.a
            boolean r0 = defpackage.xhd.h(r1)
            if (r0 == 0) goto L_0x000d
            fh7 r8 = gh7.b()
            return r8
        L_0x000d:
            zy3 r0 = r8.getInputData()
            java.lang.String r2 = "probability"
            r3 = 0
            long r5 = r0.d(r2, r3)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
            goto L_0x00d0
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            jxb r0 = kxb.a
            r0.getClass()
            d3 r0 = kxb.b
            long r5 = r0.i(r5)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
        L_0x0031:
            android.content.Context r0 = r8.getApplicationContext()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r6 = r2.dataDir     // Catch:{ Exception -> 0x00cb }
            da6 r7 = defpackage.da6.INTERNAL_DATA     // Catch:{ Exception -> 0x00cb }
            r8.e(r6, r7, r5)     // Catch:{ Exception -> 0x00cb }
            r6 = 0
            java.io.File r0 = r0.getExternalFilesDir(r6)     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x0057
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x00cb }
            goto L_0x0058
        L_0x0057:
            r0 = r6
        L_0x0058:
            da6 r7 = defpackage.da6.EXTERNAL_DATA     // Catch:{ Exception -> 0x00cb }
            r8.e(r0, r7, r5)     // Catch:{ Exception -> 0x00cb }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00cb }
            java.lang.String r2 = r2.sourceDir     // Catch:{ Exception -> 0x00cb }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00cb }
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x006e
            java.lang.String r6 = r0.getPath()     // Catch:{ Exception -> 0x00cb }
        L_0x006e:
            da6 r0 = defpackage.da6.SRC     // Catch:{ Exception -> 0x00cb }
            r8.e(r6, r0, r5)     // Catch:{ Exception -> 0x00cb }
            java.util.Collection r0 = r5.values()     // Catch:{ Exception -> 0x00cb }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00cb }
        L_0x007b:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x00cb }
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x00cb }
            ei4 r2 = (defpackage.ei4) r2     // Catch:{ Exception -> 0x00cb }
            long r6 = r2.a     // Catch:{ Exception -> 0x00cb }
            long r3 = r3 + r6
            goto L_0x007b
        L_0x008b:
            r7e r0 = r8.b     // Catch:{ Exception -> 0x00cb }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x00cb }
            di4 r0 = (defpackage.di4) r0     // Catch:{ Exception -> 0x00cb }
            r0.getClass()     // Catch:{ Exception -> 0x00cb }
            r6 = 10737418240(0x280000000, double:5.3049894774E-314)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ Exception -> 0x00cb }
            java.io.File r2 = gf6.j(r0, r1)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = c(r3, r5)     // Catch:{ Exception -> 0x00cb }
            ng5.O(r2, r0)     // Catch:{ Exception -> 0x00cb }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ Exception -> 0x00cb }
            java.lang.Long r4 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r8 = "limit"
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00cb }
            java.util.Map r5 = java.util.Collections.singletonMap(r8, r3)     // Catch:{ Exception -> 0x00cb }
            r6 = 88
            r3 = 0
            defpackage.xhd.l(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00cb }
        L_0x00c6:
            fh7 r8 = gh7.b()
            return r8
        L_0x00cb:
            dh7 r8 = gh7.a()
            return r8
        L_0x00d0:
            fh7 r8 = gh7.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.disk.usage.DiskUsageWorker.b():gh7");
    }

    public final void e(String str, da6 da6, LinkedHashMap linkedHashMap) {
        if (str != null) {
            File file = new File(str);
            ((di4) this.b.getValue()).getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ng5.N(file, ((String) it.next()).substring(da6.a.length() + 1)));
            }
            linkedHashMap.put(da6, g(file, 0, arrayList2));
        }
    }
}
