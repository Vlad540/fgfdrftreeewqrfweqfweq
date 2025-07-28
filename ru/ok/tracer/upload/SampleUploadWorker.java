package ru.ok.tracer.upload;

import android.content.Context;
import android.net.Uri;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/upload/SampleUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-sample-upload_release"}, k = 1, mv = {1, 7, 1})
public final class SampleUploadWorker extends Worker {
    public SampleUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final gh7 b() {
        /*
            r7 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0079 }
            zy3 r2 = r7.getInputData()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r3 = "tracer_sample_file_path"
            java.lang.String r2 = r2.e(r3)     // Catch:{ Exception -> 0x0079 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0079 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x001e }
            if (r2 != 0) goto L_0x0020
            r1.getPath()     // Catch:{ Exception -> 0x001e }
            fh7 r7 = gh7.b()     // Catch:{ Exception -> 0x001e }
            return r7
        L_0x001e:
            r0 = r1
            goto L_0x0079
        L_0x0020:
            zy3 r2 = r7.getInputData()     // Catch:{ Exception -> 0x001e }
            java.lang.String r3 = "tracer_sample_file_size"
            r4 = -1
            long r2 = r2.d(r3, r4)     // Catch:{ Exception -> 0x001e }
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x001e }
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0037
            r0 = r4
        L_0x0037:
            zy3 r2 = r7.getInputData()     // Catch:{ Exception -> 0x001e }
            java.lang.String r3 = "tracer_sample_file_name"
            java.lang.String r2 = r2.e(r3)     // Catch:{ Exception -> 0x001e }
            zy3 r3 = r7.getInputData()     // Catch:{ Exception -> 0x001e }
            java.lang.String r4 = "tracer_version_code"
            long r3 = r3.d(r4, r5)     // Catch:{ Exception -> 0x001e }
            android.content.Context r5 = r7.getApplicationContext()     // Catch:{ Exception -> 0x001e }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ Exception -> 0x001e }
            android.content.Context r6 = r7.getApplicationContext()     // Catch:{ Exception -> 0x001e }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ Exception -> 0x001e }
            android.content.pm.PackageInfo r5 = n1g.s(r5, r6)     // Catch:{ Exception -> 0x001e }
            long r5 = r5.getLongVersionCode()     // Catch:{ Exception -> 0x001e }
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x006f
            r1.delete()     // Catch:{ Exception -> 0x001e }
            fh7 r7 = gh7.b()     // Catch:{ Exception -> 0x001e }
            return r7
        L_0x006f:
            java.lang.String r0 = r7.c(r2, r0)     // Catch:{ Exception -> 0x001e }
            if (r0 == 0) goto L_0x0084
            r7.d(r1, r0)     // Catch:{ Exception -> 0x001e }
            goto L_0x0084
        L_0x0079:
            if (r0 == 0) goto L_0x0084
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x0084
            r0.delete()
        L_0x0084:
            fh7 r7 = gh7.b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.upload.SampleUploadWorker.b():gh7");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0168, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0169, code lost:
        urd.l(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016c, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c(java.lang.String r10, java.lang.Long r11) {
        /*
            r9 = this;
            nne r0 = defpackage.nne.a
            java.lang.String r0 = defpackage.nne.a()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            ht7 r2 = new ht7
            r2.<init>()
            zy3 r3 = r9.getInputData()
            java.util.HashMap r3 = r3.a
            java.lang.String r4 = "tracer_custom_properties_keys"
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.String[]
            if (r4 == 0) goto L_0x0022
            java.lang.String[] r3 = (java.lang.String[]) r3
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            r4 = 0
            if (r3 != 0) goto L_0x0028
            java.lang.String[] r3 = new java.lang.String[r4]
        L_0x0028:
            int r5 = r3.length
            r6 = r4
        L_0x002a:
            if (r6 >= r5) goto L_0x003e
            r7 = r3[r6]
            zy3 r8 = r9.getInputData()
            java.lang.String r8 = r8.e(r7)
            if (r8 == 0) goto L_0x003b
            r2.put(r7, r8)
        L_0x003b:
            int r6 = r6 + 1
            goto L_0x002a
        L_0x003e:
            ht7 r2 = r2.b()
            nne r3 = defpackage.nne.a
            i3d r3 = defpackage.nne.e
            if (r3 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r3 = r1
        L_0x004a:
            c9e r3 = r3.c()
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x0055
            goto L_0x0065
        L_0x0055:
            java.util.Map r5 = r3.m
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r2)
            r6.putAll(r5)
            r2 = 12287(0x2fff, float:1.7218E-41)
            c9e r3 = defpackage.c9e.a(r3, r4, r6, r2)
        L_0x0065:
            org.json.JSONObject r2 = xs7.S(r3)
            zy3 r3 = r9.getInputData()
            java.lang.String r5 = "tracer_feature_name"
            java.lang.String r3 = r3.e(r5)
            java.lang.String r6 = "feature"
            r2.put((java.lang.String) r6, (java.lang.Object) r3)
            java.lang.String r3 = "sampleSize"
            r2.put((java.lang.String) r3, (java.lang.Object) r11)
            java.lang.String r11 = "sampleFileName"
            r2.put((java.lang.String) r11, (java.lang.Object) r10)
            zy3 r10 = r9.getInputData()
            java.lang.String r11 = "tracer_has_attr1"
            boolean r10 = r10.b(r11, r4)
            r6 = 0
            if (r10 == 0) goto L_0x009f
            zy3 r10 = r9.getInputData()
            java.lang.String r11 = "tracer_attr1"
            long r10 = r10.d(r11, r6)
            java.lang.String r3 = "attr1"
            r2.put((java.lang.String) r3, (long) r10)
        L_0x009f:
            zy3 r10 = r9.getInputData()
            java.lang.String r11 = "tracer_has_attr2"
            boolean r10 = r10.b(r11, r4)
            if (r10 == 0) goto L_0x00ba
            zy3 r10 = r9.getInputData()
            java.lang.String r11 = "tracer_attr2"
            long r10 = r10.d(r11, r6)
            java.lang.String r3 = "attr2"
            r2.put((java.lang.String) r3, (long) r10)
        L_0x00ba:
            zy3 r10 = r9.getInputData()
            java.lang.String r11 = "tracer_feature_tag"
            java.lang.String r10 = r10.e(r11)
            if (r10 == 0) goto L_0x00d3
            zy3 r10 = r9.getInputData()
            java.lang.String r10 = r10.e(r11)
            java.lang.String r3 = "tag"
            r2.put((java.lang.String) r3, (java.lang.Object) r10)
        L_0x00d3:
            java.util.Map r10 = defpackage.nne.c()
            x3a r3 = xie.a
            java.lang.Object r10 = r10.get(r3)
            boolean r3 = r10 instanceof defpackage.cu3
            if (r3 == 0) goto L_0x00e4
            cu3 r10 = (defpackage.cu3) r10
            goto L_0x00e5
        L_0x00e4:
            r10 = r1
        L_0x00e5:
            if (r10 != 0) goto L_0x00ef
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            ju7.W(r10)
        L_0x00ef:
            java.lang.String r10 = "https://sdk-api.apptracer.ru"
            android.net.Uri r10 = android.net.Uri.parse(r10)
            android.net.Uri$Builder r10 = r10.buildUpon()
            java.lang.String r3 = "api/sample/initUpload"
            android.net.Uri$Builder r10 = r10.appendEncodedPath(r3)
            java.lang.String r3 = "sampleToken"
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r3, r0)
            java.lang.String r10 = r10.toString()
            jg8 r0 = new jg8
            java.lang.String r3 = r2.toString()
            java.lang.String r4 = "application/json; charset=utf-8"
            be5 r3 = mk9.h(r4, r3)
            r0.<init>((java.lang.String) r10, (defpackage.nm6) r3)
            r2.toString()
            r7e r10 = defpackage.nne.h
            java.lang.Object r10 = r10.getValue()
            tm6 r10 = (defpackage.tm6) r10
            om6 r10 = r10.b(r0)
            java.io.Closeable r0 = r10.o     // Catch:{ all -> 0x0161 }
            be5 r0 = (be5) r0     // Catch:{ all -> 0x0161 }
            if (r0 == 0) goto L_0x0163
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0161 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0161 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = p0e.L(r0)     // Catch:{ all -> 0x0161 }
            r2.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0161 }
            zy3 r0 = r9.getInputData()     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = r0.e(r5)     // Catch:{ all -> 0x0161 }
            zy3 r9 = r9.getInputData()     // Catch:{ all -> 0x0161 }
            java.lang.String r9 = r9.e(r11)     // Catch:{ all -> 0x0161 }
            qr4.t(r2, r0, r9)     // Catch:{ all -> 0x0161 }
            int r9 = r10.b     // Catch:{ all -> 0x0161 }
            r11 = 200(0xc8, float:2.8E-43)
            if (r9 == r11) goto L_0x0157
            urd.l(r10, r1)
            return r1
        L_0x0157:
            java.lang.String r9 = "uploadToken"
            java.lang.String r9 = r2.getString(r9)     // Catch:{ all -> 0x0161 }
            urd.l(r10, r1)
            return r9
        L_0x0161:
            r9 = move-exception
            goto L_0x0167
        L_0x0163:
            urd.l(r10, r1)
            return r1
        L_0x0167:
            throw r9     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r11 = move-exception
            urd.l(r10, r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.upload.SampleUploadWorker.c(java.lang.String, java.lang.Long):java.lang.String");
    }

    public final void d(File file, String str) {
        byte[] bArr;
        String str2;
        if (getInputData().b("tracer_feature_uze_gzip", true)) {
            Context applicationContext = getApplicationContext();
            String uuid = getId().toString();
            String B = xs7.B();
            if (B.equals(applicationContext.getPackageName())) {
                str2 = "tracer";
            } else {
                str2 = "tracer-" + Uri.encode(B.replace(':', '-'));
            }
            File file2 = new File(applicationContext.getCacheDir(), str2);
            h2g.t(file2);
            File N = ng5.N(file2, uuid.concat(".tmp"));
            try {
                jjd.p(file, N);
                file.length();
                N.length();
                file.delete();
                file = N;
            } catch (IOException e) {
                N.delete();
                throw e;
            }
        } else {
            file.length();
        }
        nne nne = nne.a;
        Object obj = nne.c().get(xie.a);
        if ((obj instanceof cu3 ? (cu3) obj : null) == null) {
            ju7.W(new LinkedHashMap());
        }
        String builder = Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/sample/upload").appendQueryParameter("uploadToken", str).toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mm6("file", "sample", "application/octet-stream", new qe4(file)));
        kxb.a.getClass();
        try {
            om6 b = ((tm6) nne.h.getValue()).b(new jg8(builder, (nm6) new ws4(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(kxb.b.h())}, 1)), o23.s0(arrayList))));
            try {
                be5 be5 = b.o;
                qr4.s((be5 == null || (bArr = (byte[]) be5.c) == null) ? null : p0e.L(bArr), getInputData().e("tracer_feature_name"), getInputData().e("tracer_feature_tag"));
                urd.l(b, (Throwable) null);
            } catch (Throwable th) {
                urd.l(b, th);
                throw th;
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            file.delete();
            throw th2;
        }
        file.delete();
    }
}
