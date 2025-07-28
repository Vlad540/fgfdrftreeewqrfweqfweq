package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: vm0  reason: default package */
public final class vm0 extends AsyncTask {
    public final Context a;
    public Uri b;
    public final Uri c;
    public final int d;
    public final int e;
    public final tm0 f;

    public vm0(Context context, Uri uri, Uri uri2, int i, int i2, tm0 tm0) {
        this.a = context;
        this.b = uri;
        this.c = uri2;
        this.d = i;
        this.e = i2;
        this.f = tm0;
    }

    public final void a(Uri uri, Uri uri2) {
        InputStream inputStream;
        Uri uri3 = this.c;
        if (uri2 != null) {
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = this.a.getContentResolver().openInputStream(uri);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                    if (inputStream != null) {
                        try {
                            byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    fileOutputStream2.write(bArr, 0, read);
                                } else {
                                    xy6.k(fileOutputStream2);
                                    xy6.k(inputStream);
                                    this.b = uri3;
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            xy6.k(fileOutputStream);
                            xy6.k(inputStream);
                            this.b = uri3;
                            throw th;
                        }
                    } else {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xy6.k(fileOutputStream);
                    xy6.k(inputStream);
                    this.b = uri3;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                xy6.k(fileOutputStream);
                xy6.k(inputStream);
                this.b = uri3;
                throw th;
            }
        } else {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.net.Uri r9, android.net.Uri r10) {
        /*
            r8 = this;
            android.net.Uri r0 = r8.c
            if (r10 == 0) goto L_0x007d
            qw9 r1 = new qw9
            r1.<init>()
            stf r2 = r1.a
            r3 = 0
            s86 r4 = new s86     // Catch:{ all -> 0x0067 }
            r4.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0067 }
            r4.q(r9)     // Catch:{ all -> 0x0067 }
            lac r9 = r4.j()     // Catch:{ all -> 0x0067 }
            y0c r9 = r1.b(r9)     // Catch:{ all -> 0x0067 }
            xbc r9 = r9.f()     // Catch:{ all -> 0x0067 }
            f1c r1 = r9.Z
            at0 r4 = r1.S()     // Catch:{ all -> 0x0064 }
            android.content.Context r5 = r8.a     // Catch:{ all -> 0x0062 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0062 }
            java.io.OutputStream r10 = r5.openOutputStream(r10)     // Catch:{ all -> 0x0062 }
            if (r10 == 0) goto L_0x005a
            java.util.logging.Logger r5 = defpackage.tw9.a     // Catch:{ all -> 0x0062 }
            yw r5 = new yw     // Catch:{ all -> 0x0062 }
            xje r6 = new xje     // Catch:{ all -> 0x0062 }
            r6.<init>()     // Catch:{ all -> 0x0062 }
            r7 = 1
            r5.<init>(r10, r7, r6)     // Catch:{ all -> 0x0062 }
            r4.K(r5)     // Catch:{ all -> 0x0055 }
            defpackage.xy6.k(r4)
            defpackage.xy6.k(r5)
            defpackage.xy6.k(r1)
            r2.d()
            r8.b = r0
            return
        L_0x0055:
            r10 = move-exception
        L_0x0056:
            r3 = r4
            goto L_0x006a
        L_0x0058:
            r5 = r3
            goto L_0x0056
        L_0x005a:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "OutputStream for given output Uri is null"
            r10.<init>(r1)     // Catch:{ all -> 0x0062 }
            throw r10     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r10 = move-exception
            goto L_0x0058
        L_0x0064:
            r10 = move-exception
            r5 = r3
            goto L_0x006a
        L_0x0067:
            r10 = move-exception
            r9 = r3
            r5 = r9
        L_0x006a:
            defpackage.xy6.k(r3)
            defpackage.xy6.k(r5)
            if (r9 == 0) goto L_0x0077
            f1c r9 = r9.Z
            defpackage.xy6.k(r9)
        L_0x0077:
            r2.d()
            r8.b = r0
            throw r10
        L_0x007d:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "Output Uri is null - cannot download image"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm0.b(android.net.Uri, android.net.Uri):void");
    }

    public final String c() {
        Context context = this.a;
        Uri uri = null;
        if (d8.d(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return null;
        }
        Uri uri2 = this.b;
        if (DocumentsContract.isDocumentUri(context, uri2)) {
            if ("com.android.externalstorage.documents".equals(uri2.getAuthority())) {
                String[] split = DocumentsContract.getDocumentId(uri2).split(":");
                if (!"primary".equalsIgnoreCase(split[0])) {
                    return null;
                }
                return Environment.getExternalStorageDirectory() + "/" + split[1];
            } else if ("com.android.providers.downloads.documents".equals(uri2.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri2);
                if (TextUtils.isEmpty(documentId)) {
                    return null;
                }
                try {
                    return r1g.k(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
                } catch (NumberFormatException e2) {
                    e2.getMessage();
                    return null;
                }
            } else if (!"com.android.providers.media.documents".equals(uri2.getAuthority())) {
                return null;
            } else {
                String[] split2 = DocumentsContract.getDocumentId(uri2).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return r1g.k(context, uri, "_id=?", new String[]{split2[1]});
            }
        } else if ("content".equalsIgnoreCase(uri2.getScheme())) {
            return "com.google.android.apps.photos.content".equals(uri2.getAuthority()) ? uri2.getLastPathSegment() : r1g.k(context, uri2, (String) null, (String[]) null);
        } else {
            if ("file".equalsIgnoreCase(uri2.getScheme())) {
                return uri2.getPath();
            }
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [o25, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010a, code lost:
        if (r7.sameAs(r15) == false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.um0 d() {
        /*
            r18 = this;
            r0 = r18
            android.content.Context r1 = r0.a
            android.net.Uri r2 = r0.b
            if (r2 != 0) goto L_0x0015
            um0 r0 = new um0
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Input Uri cannot be null"
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        L_0x0015:
            r18.e()     // Catch:{ IOException | NullPointerException -> 0x0161 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x015a }
            android.net.Uri r3 = r0.b     // Catch:{ FileNotFoundException -> 0x015a }
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r3, r4)     // Catch:{ FileNotFoundException -> 0x015a }
            java.lang.String r3 = "]"
            if (r2 == 0) goto L_0x013c
            java.io.FileDescriptor r4 = r2.getFileDescriptor()
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r6 = 1
            r5.inJustDecodeBounds = r6
            r7 = 0
            android.graphics.BitmapFactory.decodeFileDescriptor(r4, r7, r5)
            int r8 = r5.outWidth
            r9 = -1
            if (r8 == r9) goto L_0x011e
            int r10 = r5.outHeight
            if (r10 != r9) goto L_0x0043
            goto L_0x011e
        L_0x0043:
            int r11 = r0.d
            int r12 = r0.e
            if (r10 > r12) goto L_0x004e
            if (r8 <= r11) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r13 = r6
            goto L_0x0059
        L_0x004e:
            r13 = r6
        L_0x004f:
            int r14 = r10 / r13
            if (r14 > r12) goto L_0x011a
            int r14 = r8 / r13
            if (r14 <= r11) goto L_0x0059
            goto L_0x011a
        L_0x0059:
            r5.inSampleSize = r13
            r5.inMutable = r6
            r8 = 0
            r5.inJustDecodeBounds = r8
            r15 = r7
            r10 = r8
        L_0x0062:
            r11 = 2
            if (r10 != 0) goto L_0x0071
            android.graphics.Bitmap r15 = android.graphics.BitmapFactory.decodeFileDescriptor(r4, r7, r5)     // Catch:{ OutOfMemoryError -> 0x006b }
            r10 = r6
            goto L_0x0062
        L_0x006b:
            int r12 = r5.inSampleSize
            int r12 = r12 * r11
            r5.inSampleSize = r12
            goto L_0x0062
        L_0x0071:
            if (r15 != 0) goto L_0x0091
            um0 r1 = new um0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Bitmap could not be decoded from the Uri: ["
            r4.<init>(r5)
            android.net.Uri r0 = r0.b
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            return r1
        L_0x0091:
            defpackage.xy6.k(r2)
            android.net.Uri r0 = r0.b
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ IOException -> 0x00af }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x00af }
            if (r1 != 0) goto L_0x00a2
            r2 = r8
            goto L_0x00b3
        L_0x00a2:
            nq6 r2 = new nq6     // Catch:{ IOException -> 0x00af }
            r2.<init>(r1)     // Catch:{ IOException -> 0x00af }
            int r2 = r2.a()     // Catch:{ IOException -> 0x00af }
            defpackage.xy6.k(r1)     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b3
        L_0x00af:
            r2 = r8
        L_0x00b0:
            r0.toString()
        L_0x00b3:
            switch(r2) {
                case 3: goto L_0x00bd;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00ba;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00b7;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x00bf
        L_0x00b7:
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x00bf
        L_0x00ba:
            r8 = 90
            goto L_0x00bf
        L_0x00bd:
            r8 = 180(0xb4, float:2.52E-43)
        L_0x00bf:
            if (r2 == r11) goto L_0x00cb
            r0 = 7
            if (r2 == r0) goto L_0x00cb
            r0 = 4
            if (r2 == r0) goto L_0x00cb
            r0 = 5
            if (r2 == r0) goto L_0x00cb
            r9 = r6
        L_0x00cb:
            o25 r0 = new o25
            r0.<init>()
            r0.a = r2
            r0.b = r8
            r0.c = r9
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            if (r8 == 0) goto L_0x00e1
            float r2 = (float) r8
            r1.preRotate(r2)
        L_0x00e1:
            if (r9 == r6) goto L_0x00e9
            float r2 = (float) r9
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.postScale(r2, r3)
        L_0x00e9:
            boolean r2 = r1.isIdentity()
            if (r2 != 0) goto L_0x0113
            um0 r2 = new um0
            int r14 = r15.getWidth()     // Catch:{ OutOfMemoryError -> 0x010d }
            int r3 = r15.getHeight()     // Catch:{ OutOfMemoryError -> 0x010d }
            r12 = 0
            r13 = 0
            r17 = 1
            r11 = r15
            r7 = r15
            r15 = r3
            r16 = r1
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x010e }
            boolean r1 = r7.sameAs(r15)     // Catch:{ OutOfMemoryError -> 0x010e }
            if (r1 != 0) goto L_0x010e
            goto L_0x010f
        L_0x010d:
            r7 = r15
        L_0x010e:
            r15 = r7
        L_0x010f:
            r2.<init>(r15, r0)
            return r2
        L_0x0113:
            r7 = r15
            um0 r1 = new um0
            r1.<init>(r7, r0)
            return r1
        L_0x011a:
            int r13 = r13 * 2
            goto L_0x004f
        L_0x011e:
            um0 r1 = new um0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Bounds for bitmap could not be retrieved from the Uri: ["
            r4.<init>(r5)
            android.net.Uri r0 = r0.b
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            return r1
        L_0x013c:
            um0 r1 = new um0
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ParcelFileDescriptor was null for given Uri: ["
            r4.<init>(r5)
            android.net.Uri r0 = r0.b
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            return r1
        L_0x015a:
            r0 = move-exception
            um0 r1 = new um0
            r1.<init>(r0)
            return r1
        L_0x0161:
            r0 = move-exception
            um0 r1 = new um0
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm0.d():um0");
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return d();
    }

    public final void e() {
        String scheme = this.b.getScheme();
        boolean equals = "http".equals(scheme);
        Uri uri = this.c;
        if (equals || "https".equals(scheme)) {
            b(this.b, uri);
            return;
        } else if ("content".equals(scheme)) {
            ParcelFileDescriptor openFileDescriptor = this.a.getContentResolver().openFileDescriptor(this.b, "r");
            try {
                if (!openFileDescriptor.getFileDescriptor().valid()) {
                    String c2 = c();
                    File file = new File(c2);
                    if (TextUtils.isEmpty(c2) || !file.exists()) {
                        a(this.b, uri);
                    } else {
                        this.b = Uri.fromFile(file);
                    }
                }
                openFileDescriptor.close();
                return;
            } catch (IOException | NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else if (TextUtils.isEmpty(scheme)) {
            File file2 = new File(this.b.getPath());
            if (file2.exists()) {
                this.b = Uri.fromFile(file2);
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Invalid uri %s", new Object[]{this.b}));
        } else if (!"file".equals(scheme)) {
            throw new IllegalArgumentException(rf0.h("Invalid Uri scheme", scheme));
        } else {
            return;
        }
        throw th;
    }

    public final void onPostExecute(Object obj) {
        um0 um0 = (um0) obj;
        Exception exc = um0.b;
        tm0 tm0 = this.f;
        if (exc == null) {
            this.b.getPath();
            Uri uri = this.c;
            tm0.O(uri == null ? null : uri.getPath(), um0.a);
            return;
        }
        tm0.B();
    }
}
