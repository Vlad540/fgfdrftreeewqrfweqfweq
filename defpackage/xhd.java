package defpackage;

import android.content.Context;
import android.media.CamcorderProfile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: xhd  reason: default package */
public final class xhd implements j26, gu3, of3, oq1, dg9, x89 {
    public static volatile v2b a;
    public static final xhd b = new Object();
    public static final /* synthetic */ xhd c = new Object();
    public static final xhd o = new Object();

    public static final lg7 d(DataInputStream dataInputStream) {
        Object obj;
        lg7 c2 = hwf.c();
        while (dataInputStream.read() == 3) {
            long readLong = dataInputStream.readLong();
            String readUTF = dataInputStream.readUTF();
            long readLong2 = dataInputStream.readLong();
            String readUTF2 = dataInputStream.readUTF();
            ht7 ht7 = new ht7();
            int readInt = dataInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                String readUTF3 = dataInputStream.readUTF();
                int readInt2 = dataInputStream.readInt();
                if (readInt2 == 1) {
                    obj = dataInputStream.readUTF();
                } else if (readInt2 == 2) {
                    obj = Boolean.valueOf(dataInputStream.readBoolean());
                } else if (readInt2 == 3) {
                    obj = Long.valueOf(dataInputStream.readLong());
                } else if (readInt2 == 4) {
                    obj = Double.valueOf(dataInputStream.readDouble());
                } else {
                    throw new IOException(wn6.h(readInt2, "Unsupported attribute value type "));
                }
                ht7.put(readUTF3, obj);
            }
            c2.add(new mma(readLong, readUTF, readLong2, readUTF2, ht7.b()));
        }
        return hwf.a(c2);
    }

    public static final void e(DataOutputStream dataOutputStream, mma mma) {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeLong(mma.a);
        dataOutputStream.writeUTF(mma.b);
        dataOutputStream.writeLong(mma.c);
        dataOutputStream.writeUTF(mma.d);
        Map map = mma.e;
        dataOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            dataOutputStream.writeUTF((String) entry.getKey());
            if (value instanceof Boolean) {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
            } else {
                if (value instanceof Long ? true : value instanceof Integer ? true : value instanceof Byte ? true : value instanceof Short) {
                    dataOutputStream.writeInt(3);
                    dataOutputStream.writeLong(((Number) value).longValue());
                } else {
                    if (value instanceof Double ? true : value instanceof Float) {
                        dataOutputStream.writeInt(4);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else {
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeUTF(value.toString());
                    }
                }
            }
        }
    }

    public static md4 g(xhd xhd, Integer num) {
        md4 md4;
        md4 md42 = md4.REGULAR;
        xhd.getClass();
        byte byteValue = num.byteValue();
        md4[] values = md4.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                md4 = null;
                break;
            }
            md4 = values[i];
            if (md4.a == byteValue) {
                break;
            }
            i++;
        }
        return md4 == null ? md42 : md4;
    }

    public static boolean h(x3a x3a) {
        v2b v2b = a;
        if (v2b == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        } else if (vx3.c(v2b, "system.shutdown.until.ts")) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder("system.");
            sb.append((String) x3a.b);
            sb.append(".shutdown.until.ts");
            return vx3.c(v2b, sb.toString());
        }
    }

    public static void i() {
        tt6 i = o2a.a.i();
        if (i != null) {
            i.b(1);
        }
    }

    public static j51 j(JSONObject jSONObject) {
        String optString;
        ge1 b2;
        String optString2 = jSONObject.optString("key");
        int i = 0;
        jSONObject.optInt("totalCount", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return new j51(optString2, hw4.a);
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        if (length >= 0) {
            while (true) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (optString = optJSONObject.optString("participantId")) == null || (b2 = ge1.b(optString)) == null)) {
                    arrayList.add(b2);
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new j51(optString2, arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: cu3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(android.content.Context r15, x3a r16, java.io.File r17, java.lang.String r18, java.lang.Long r19, java.util.Map r20, int r21) {
        /*
            r0 = r21
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r18
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0012
            iw4 r0 = iw4.a
            goto L_0x0014
        L_0x0012:
            r0 = r20
        L_0x0014:
            long r3 = r17.length()
            java.lang.String r5 = r17.getName()
            android.content.pm.PackageManager r6 = r15.getPackageManager()
            java.lang.String r7 = r15.getPackageName()
            android.content.pm.PackageInfo r6 = n1g.s(r6, r7)
            long r6 = r6.getLongVersionCode()
            x3a r8 = new x3a
            r9 = 9
            r8.<init>(r9)
            java.lang.String r9 = "tracer_feature_name"
            r10 = r16
            java.lang.Object r10 = r10.b
            java.lang.String r10 = (java.lang.String) r10
            r8.M(r9, r10)
            java.lang.String r9 = "tracer_feature_uze_gzip"
            r10 = 1
            r8.K(r9, r10)
            java.lang.String r9 = "tracer_sample_file_path"
            java.lang.String r11 = r17.getPath()
            r8.M(r9, r11)
            java.lang.String r9 = "tracer_sample_file_size"
            r8.L(r3, r9)
            java.lang.String r3 = "tracer_sample_file_name"
            r8.M(r3, r5)
            java.lang.String r3 = "tracer_feature_tag"
            r8.M(r3, r1)
            java.lang.String r1 = "tracer_has_attr1"
            r8.K(r1, r10)
            java.lang.Object r1 = r8.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r3 = "tracer_attr1"
            r4 = r19
            r1.put(r3, r4)
            java.util.Set r1 = r0.keySet()
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r3 = r8.b
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "tracer_custom_properties_keys"
            r3.put(r4, r1)
            r8.I(r0)
            java.lang.String r0 = "tracer_version_code"
            r8.L(r6, r0)
            zy3 r0 = r8.k()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            nne r3 = defpackage.nne.a
            java.util.Map r3 = defpackage.nne.c()
            x3a r4 = xie.a
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof defpackage.cu3
            if (r4 == 0) goto L_0x00a6
            r2 = r3
            cu3 r2 = (defpackage.cu3) r2
        L_0x00a6:
            if (r2 != 0) goto L_0x00b2
            b2b r2 = new b2b
            r3 = 13
            r2.<init>(r3)
            r2.s()
        L_0x00b2:
            java.util.Set r14 = o23.w0(r1)
            if3 r1 = new if3
            r8 = 1
            r9 = 0
            r5 = 3
            r6 = 0
            r7 = 1
            r10 = -1
            r12 = -1
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r12, r14)
            bfa r2 = new bfa
            java.lang.Class<ru.ok.tracer.upload.SampleUploadWorker> r3 = ru.ok.tracer.upload.SampleUploadWorker.class
            r2.<init>(r3)
            androidx.work.WorkRequest$Builder r1 = r2.setConstraints(r1)
            bfa r1 = (bfa) r1
            androidx.work.WorkRequest$Builder r0 = r1.setInputData(r0)
            bfa r0 = (bfa) r0
            androidx.work.WorkRequest r0 = r0.build()
            cfa r0 = (cfa) r0
            itf r1 = itf.d(r15)
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xhd.l(android.content.Context, x3a, java.io.File, java.lang.String, java.lang.Long, java.util.Map, int):void");
    }

    public static long m() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public void accept(Object obj) {
        udd.s("mtf", "failure!", (Throwable) obj);
    }

    public Object apply(Object obj) {
        List list = (List) obj;
        return list.isEmpty() ? hx7.a : ax7.e(list);
    }

    public boolean b(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00b5 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(java.lang.String r5) {
        /*
            r4 = this;
            ild[] r4 = com.facebook.soloader.SoLoader.e
            r0 = 0
            if (r4 != 0) goto L_0x0065
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r4.readLock()
            r1.lock()
            ild[] r1 = com.facebook.soloader.SoLoader.e     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "http://www.android.com/"
            java.lang.String r2 = "java.vendor.url"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x0051 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = com.facebook.soloader.SoLoader.h()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0027
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "SoLoader.init() not yet called"
            r4.<init>(r5)     // Catch:{ all -> 0x0051 }
            throw r4     // Catch:{ all -> 0x0051 }
        L_0x002f:
            java.lang.Class<com.facebook.soloader.SoLoader> r1 = com.facebook.soloader.SoLoader.class
            monitor-enter(r1)     // Catch:{ all -> 0x0051 }
            java.util.HashSet r2 = com.facebook.soloader.SoLoader.h     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x0040 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0042
            java.lang.System.loadLibrary(r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0042
        L_0x0040:
            r4 = move-exception
            goto L_0x004f
        L_0x0042:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
            r4.unlock()
            goto L_0x0066
        L_0x004f:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r4 = move-exception
            goto L_0x005b
        L_0x0053:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
            r4.unlock()
            goto L_0x0065
        L_0x005b:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()
            r5.unlock()
            throw r4
        L_0x0065:
            r2 = r0
        L_0x0066:
            if (r2 == 0) goto L_0x006d
            boolean r4 = r2.booleanValue()
            goto L_0x0086
        L_0x006d:
            boolean r4 = com.facebook.soloader.SoLoader.k
            if (r4 != 0) goto L_0x0076
            boolean r4 = kjd.D(r5)
            goto L_0x0086
        L_0x0076:
            int r4 = com.facebook.soloader.SoLoader.m
            r1 = 2
            if (r4 == r1) goto L_0x007c
            r1 = 3
        L_0x007c:
            java.lang.String r4 = java.lang.System.mapLibraryName(r5)
            r1 = r0
        L_0x0081:
            r2 = 0
            boolean r4 = com.facebook.soloader.SoLoader.i(r4, r5, r2, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0087 }
        L_0x0086:
            return r4
        L_0x0087:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()
            r3.lock()
            if (r1 != 0) goto L_0x009c
            og0 r1 = com.facebook.soloader.SoLoader.d()     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            goto L_0x009c
        L_0x0098:
            r4 = move-exception
            goto L_0x00b7
        L_0x009a:
            r4 = move-exception
            goto L_0x00b6
        L_0x009c:
            if (r1 == 0) goto L_0x00c1
            ild[] r3 = com.facebook.soloader.SoLoader.e     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            boolean r3 = r1.i(r2, r3)     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            if (r3 == 0) goto L_0x00c1
            java.util.concurrent.atomic.AtomicInteger r3 = com.facebook.soloader.SoLoader.f     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            r3.getAndIncrement()     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.unlock()
            goto L_0x0081
        L_0x00b5:
            throw r2     // Catch:{ all -> 0x0098 }
        L_0x00b6:
            throw r4     // Catch:{ all -> 0x0098 }
        L_0x00b7:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()
            r5.unlock()
            throw r4
        L_0x00c1:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xhd.c(java.lang.String):boolean");
    }

    public Object f(ws8 ws8) {
        long j = 0;
        try {
            j = jjd.J(ws8, 0);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t != 0) {
                if (t != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }

    public x3 k(Context context, String str, smc smc) {
        x3 x3Var = new x3();
        int r = smc.r(context, str, true);
        x3Var.b = r;
        if (r != 0) {
            x3Var.c = 1;
        } else {
            int p = smc.p(context, str);
            x3Var.a = p;
            if (p != 0) {
                x3Var.c = -1;
            }
        }
        return x3Var;
    }
}
