package defpackage;

import java.util.concurrent.Callable;

/* renamed from: m5  reason: default package */
public final /* synthetic */ class m5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.content.Context, r5, android.app.Activity, ru.ok.messages.views.ActAvatarCrop] */
    /* JADX WARNING: type inference failed for: r15v0, types: [vbe, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v60, types: [vve, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0296, code lost:
        r4 = (java.lang.ref.WeakReference) r1.next();
        r7 = (defpackage.jg9) r4.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02a2, code lost:
        if (r7 != null) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02a4, code lost:
        r7.onFailed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02a7, code lost:
        r4.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05f0, code lost:
        if (r12.d == r6) goto L_0x05f2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0284 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0281 A[SYNTHETIC, Splitter:B:141:0x0281] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0296 A[Catch:{ all -> 0x02ac, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0305  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r19 = this;
            r0 = r19
            r1 = 3
            r2 = 14
            r3 = 2
            r4 = 6
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            int r10 = r0.a
            switch(r10) {
                case 0: goto L_0x06d5;
                case 1: goto L_0x06c3;
                case 2: goto L_0x040e;
                case 3: goto L_0x0398;
                case 4: goto L_0x038d;
                case 5: goto L_0x0377;
                case 6: goto L_0x033e;
                case 7: goto L_0x0335;
                case 8: goto L_0x031f;
                case 9: goto L_0x02bc;
                case 10: goto L_0x013c;
                case 11: goto L_0x012f;
                case 12: goto L_0x0122;
                case 13: goto L_0x0119;
                case 14: goto L_0x00dd;
                case 15: goto L_0x0061;
                case 16: goto L_0x0058;
                default: goto L_0x0011;
            }
        L_0x0011:
            vve r1 = new vve
            r1.<init>()
            rxe r2 = defpackage.rxe.UNKNOWN
            r1.g = r2
            java.lang.Object r0 = r0.b
            fwe r0 = (defpackage.fwe) r0
            r1.a = r0
            rxe r2 = defpackage.rxe.UPLOADING
            r1.g = r2
            java.lang.String r0 = r0.a
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ all -> 0x0034 }
            long r2 = r2.length()     // Catch:{ all -> 0x0034 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x003b
        L_0x0034:
            r0 = move-exception
            kcc r2 = new kcc
            r2.<init>(r0)
            r0 = r2
        L_0x003b:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            boolean r3 = r0 instanceof kcc
            if (r3 == 0) goto L_0x0044
            r0 = r2
        L_0x0044:
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r1.f = r2
            long r2 = java.lang.System.currentTimeMillis()
            r1.i = r2
            wve r0 = new wve
            r0.<init>(r1)
            return r0
        L_0x0058:
            java.lang.Object r0 = r0.b
            org.webrtc.TextureBufferImpl r0 = (org.webrtc.TextureBufferImpl) r0
            org.webrtc.VideoFrame$I420Buffer r0 = r0.lambda$toI420$1()
            return r0
        L_0x0061:
            java.lang.Object r0 = r0.b
            tae r0 = (defpackage.tae) r0
            t97 r1 = r0.o
            java.lang.Object r1 = r1.getValue()
            bf5 r1 = (defpackage.bf5) r1
            mg5 r1 = (defpackage.mg5) r1
            r1.getClass()
            android.content.Context r1 = r1.c
            java.io.File r2 = r1.getExternalFilesDir(r8)
            if (r2 != 0) goto L_0x007e
            java.io.File r2 = r1.getExternalCacheDir()
        L_0x007e:
            if (r2 != 0) goto L_0x0084
            java.io.File r2 = r1.getFilesDir()
        L_0x0084:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r2.getAbsolutePath()
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0096
            r1.mkdirs()
        L_0x0096:
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = "font"
            java.io.File r1 = defpackage.mg5.g(r1, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "TamNotoColorEmojiCompat.ttf"
            r2.<init>(r1, r3)
            boolean r1 = lp.n(r2)
            if (r1 == 0) goto L_0x00d7
            t97 r0 = r0.c
            java.lang.Object r1 = r0.getValue()
            g2b r1 = (defpackage.g2b) r1
            j2b r1 = (defpackage.j2b) r1
            kp r1 = r1.c
            x97 r1 = r1.g
            java.lang.String r3 = "app.extra.downloaded.emoji.font.url"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.getString(r3, r4)
            java.lang.Object r0 = r0.getValue()
            g2b r0 = (defpackage.g2b) r0
            j2b r0 = (defpackage.j2b) r0
            yzc r0 = r0.b
            r0.getClass()
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x00d7
            r7 = r9
        L_0x00d7:
            sae r0 = new sae
            r0.<init>(r2, r7)
            return r0
        L_0x00dd:
            java.lang.Object r0 = r0.b
            nxc r0 = (defpackage.nxc) r0
            r0.getClass()
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.lang.Object r0 = r0.a
            java.io.File r0 = (java.io.File) r0
            r1.<init>(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x0106 }
            o39 r2 = new o39     // Catch:{ all -> 0x0106 }
            h39 r3 = d8.y(r1)     // Catch:{ all -> 0x0106 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0106 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x010d }
            r1.close()
            return r2
        L_0x0106:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x010d }
            throw r0     // Catch:{ all -> 0x010d }
        L_0x010b:
            r2 = r0
            goto L_0x010f
        L_0x010d:
            r0 = move-exception
            goto L_0x010b
        L_0x010f:
            r1.close()     // Catch:{ all -> 0x0113 }
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)
        L_0x0118:
            throw r2
        L_0x0119:
            java.lang.Object r0 = r0.b
            bec r0 = (defpackage.bec) r0
            aec r0 = r0.m()
            return r0
        L_0x0122:
            java.lang.Object r0 = r0.b
            i6g r0 = (i6g) r0
            java.lang.Object r0 = r0.a
            android.net.Uri r0 = (android.net.Uri) r0
            android.graphics.Bitmap r0 = xs7.t(r0)
            return r0
        L_0x012f:
            java.lang.Object r0 = r0.b
            ocd r0 = (defpackage.ocd) r0
            org.webrtc.EglBase r0 = r0.h
            if (r0 == 0) goto L_0x013b
            org.webrtc.EglBase$Context r8 = r0.getEglBaseContext()
        L_0x013b:
            return r8
        L_0x013c:
            java.lang.Object r0 = r0.b
            r1 = r0
            ig9 r1 = (defpackage.ig9) r1
            r94 r0 = r1.b     // Catch:{ all -> 0x0167 }
            java.lang.String r2 = r1.d     // Catch:{ all -> 0x0167 }
            mg9 r0 = r0.b(r2)     // Catch:{ all -> 0x0167 }
            if (r0 == 0) goto L_0x016e
            java.io.File r2 = r0.b     // Catch:{ all -> 0x0167 }
            boolean r2 = r2.exists()     // Catch:{ all -> 0x0167 }
            if (r2 == 0) goto L_0x016e
            java.io.File r2 = r0.b     // Catch:{ all -> 0x0167 }
            boolean r2 = r2.canRead()     // Catch:{ all -> 0x0167 }
            if (r2 == 0) goto L_0x016e
            java.io.File r2 = r0.b     // Catch:{ all -> 0x0167 }
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x0167 }
            r1.c(r2, r3)     // Catch:{ all -> 0x0167 }
            java.lang.String r1 = defpackage.lg9.a
            r8 = r0
            goto L_0x025b
        L_0x0167:
            r0 = move-exception
            r2 = r8
            r3 = r2
            r5 = r3
        L_0x016b:
            r6 = r5
            goto L_0x027d
        L_0x016e:
            boolean r0 = r1.e     // Catch:{ all -> 0x0167 }
            if (r0 != 0) goto L_0x0176
            java.lang.String r0 = defpackage.lg9.a
            goto L_0x025b
        L_0x0176:
            r94 r0 = r1.b     // Catch:{ all -> 0x0167 }
            java.lang.String r2 = r1.d     // Catch:{ all -> 0x0167 }
            r0.getClass()     // Catch:{ all -> 0x0167 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0167 }
            x3a r5 = r0.a     // Catch:{ all -> 0x0167 }
            java.io.File r5 = r5.v()     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = r0.a(r2)     // Catch:{ all -> 0x0167 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0167 }
            r2.<init>()     // Catch:{ all -> 0x0167 }
            r2.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = ".temp"
            r2.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0167 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0167 }
            java.io.File r0 = r3.getParentFile()     // Catch:{ all -> 0x0167 }
            if (r0 == 0) goto L_0x01a6
            r0.mkdirs()     // Catch:{ all -> 0x0167 }
        L_0x01a6:
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0167 }
            if (r0 != 0) goto L_0x01af
            r3.createNewFile()     // Catch:{ all -> 0x0167 }
        L_0x01af:
            n7a r0 = r1.a     // Catch:{ all -> 0x027b }
            java.lang.String r2 = r1.d     // Catch:{ all -> 0x027b }
            r0.getClass()     // Catch:{ all -> 0x027b }
            s86 r5 = new s86     // Catch:{ all -> 0x027b }
            r5.<init>()     // Catch:{ all -> 0x027b }
            r5.q(r2)     // Catch:{ all -> 0x027b }
            lac r2 = r5.j()     // Catch:{ all -> 0x027b }
            t97 r0 = r0.a     // Catch:{ all -> 0x027b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x027b }
            qw9 r0 = (qw9) r0     // Catch:{ all -> 0x027b }
            y0c r0 = r0.b(r2)     // Catch:{ all -> 0x027b }
            xbc r0 = r0.f()     // Catch:{ all -> 0x027b }
            rw9 r2 = new rw9     // Catch:{ all -> 0x027b }
            r2.<init>(r0)     // Catch:{ all -> 0x027b }
            boolean r5 = r0.m()     // Catch:{ all -> 0x0275 }
            if (r5 == 0) goto L_0x026d
            f1c r0 = r0.Z     // Catch:{ all -> 0x0275 }
            if (r0 == 0) goto L_0x0262
            java.io.InputStream r5 = r0.m()     // Catch:{ all -> 0x0275 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x025f }
            r6.<init>(r3, r7)     // Catch:{ all -> 0x025f }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01f9 }
        L_0x01ee:
            int r10 = r5.read(r0)     // Catch:{ all -> 0x01f9 }
            r11 = -1
            if (r10 == r11) goto L_0x01fc
            r6.write(r0, r7, r10)     // Catch:{ all -> 0x01f9 }
            goto L_0x01ee
        L_0x01f9:
            r0 = move-exception
            goto L_0x027d
        L_0x01fc:
            r6.flush()     // Catch:{ all -> 0x01f9 }
            xbc r0 = r2.a     // Catch:{ all -> 0x01f9 }
            java.lang.String r10 = "Content-Disposition"
            java.lang.String r0 = xbc.a(r0, r10)     // Catch:{ all -> 0x01f9 }
            if (r0 == 0) goto L_0x0232
            int r10 = r0.length()     // Catch:{ all -> 0x01f9 }
            if (r10 != 0) goto L_0x0210
            goto L_0x0232
        L_0x0210:
            java.util.regex.Pattern r10 = rw9.b     // Catch:{ IllegalStateException -> 0x0221 }
            java.util.regex.Matcher r0 = r10.matcher(r0)     // Catch:{ IllegalStateException -> 0x0221 }
            boolean r10 = r0.find()     // Catch:{ IllegalStateException -> 0x0221 }
            if (r10 == 0) goto L_0x0221
            java.lang.String r0 = r0.group(r9)     // Catch:{ IllegalStateException -> 0x0221 }
            goto L_0x0222
        L_0x0221:
            r0 = r8
        L_0x0222:
            if (r0 == 0) goto L_0x0233
            r10 = 47
            int r4 = h0e.e0(r0, r10, r7, r4)     // Catch:{ all -> 0x01f9 }
            int r4 = r4 + r9
            if (r4 <= 0) goto L_0x0233
            java.lang.String r0 = r0.substring(r4)     // Catch:{ all -> 0x01f9 }
            goto L_0x0233
        L_0x0232:
            r0 = r8
        L_0x0233:
            r94 r4 = r1.b     // Catch:{ all -> 0x01f9 }
            java.lang.String r7 = r1.d     // Catch:{ all -> 0x01f9 }
            java.io.File r4 = r4.c(r7, r0)     // Catch:{ all -> 0x01f9 }
            java.io.File r7 = r4.getParentFile()     // Catch:{ all -> 0x01f9 }
            if (r7 == 0) goto L_0x0244
            r7.mkdirs()     // Catch:{ all -> 0x01f9 }
        L_0x0244:
            defpackage.lg9.b(r3, r4)     // Catch:{ all -> 0x025c }
            r1.c(r4, r0)     // Catch:{ all -> 0x025c }
            mg9 r8 = new mg9     // Catch:{ all -> 0x025c }
            r8.<init>(r4, r0)     // Catch:{ all -> 0x025c }
            defpackage.lg9.a(r2)
            defpackage.lg9.a(r5)
            defpackage.lg9.a(r6)
            r3.delete()     // Catch:{ all -> 0x025b }
        L_0x025b:
            return r8
        L_0x025c:
            r0 = move-exception
            r8 = r4
            goto L_0x027d
        L_0x025f:
            r0 = move-exception
            r6 = r8
            goto L_0x027d
        L_0x0262:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0275 }
            java.lang.String r4 = "failed to get response body"
            r0.<init>(r4)     // Catch:{ all -> 0x0275 }
            throw r0     // Catch:{ all -> 0x0275 }
        L_0x026a:
            r5 = r8
            goto L_0x016b
        L_0x026d:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0275 }
            java.lang.String r4 = r1.d     // Catch:{ all -> 0x0275 }
            r0.<init>(r4)     // Catch:{ all -> 0x0275 }
            throw r0     // Catch:{ all -> 0x0275 }
        L_0x0275:
            r0 = move-exception
            goto L_0x026a
        L_0x0277:
            r2 = r8
            r5 = r2
            goto L_0x016b
        L_0x027b:
            r0 = move-exception
            goto L_0x0277
        L_0x027d:
            java.lang.String r4 = defpackage.lg9.a     // Catch:{ all -> 0x02ac }
            if (r8 == 0) goto L_0x0284
            r8.delete()     // Catch:{ all -> 0x0284 }
        L_0x0284:
            java.util.concurrent.atomic.AtomicReference r1 = r1.f     // Catch:{ all -> 0x02ac }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x02ac }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x02ac }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x02ac }
        L_0x0290:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x02ac }
            if (r4 == 0) goto L_0x02ab
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x02ac }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x02ac }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x02ac }
            jg9 r7 = (defpackage.jg9) r7     // Catch:{ all -> 0x02ac }
            if (r7 == 0) goto L_0x02a7
            r7.onFailed(r0)     // Catch:{ all -> 0x02ac }
        L_0x02a7:
            r4.clear()     // Catch:{ all -> 0x02ac }
            goto L_0x0290
        L_0x02ab:
            throw r0     // Catch:{ all -> 0x02ac }
        L_0x02ac:
            r0 = move-exception
            defpackage.lg9.a(r2)
            defpackage.lg9.a(r5)
            defpackage.lg9.a(r6)
            if (r3 == 0) goto L_0x02bb
            r3.delete()     // Catch:{ all -> 0x02bb }
        L_0x02bb:
            throw r0
        L_0x02bc:
            java.lang.String r1 = "Can't get video params for path "
            java.lang.Object r0 = r0.b
            r2 = r0
            tl7 r2 = (defpackage.tl7) r2
            java.lang.String r3 = r2.a
            android.media.MediaMetadataRetriever r4 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x02e5 }
            r4.<init>()     // Catch:{ all -> 0x02e5 }
            android.content.Context r0 = r2.b     // Catch:{ all -> 0x02e2 }
            android.net.Uri r9 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x02e2 }
            r4.setDataSource(r0, r9)     // Catch:{ all -> 0x02e2 }
            android.graphics.Point r9 = defpackage.x87.W(r4)     // Catch:{ all -> 0x02e2 }
            int r0 = defpackage.x87.T(r4)     // Catch:{ all -> 0x02e0 }
            long r5 = (long) r0
        L_0x02dc:
            defpackage.x87.A0(r4)
            goto L_0x02fa
        L_0x02e0:
            r0 = move-exception
            goto L_0x02e8
        L_0x02e2:
            r0 = move-exception
            r9 = r8
            goto L_0x02e8
        L_0x02e5:
            r0 = move-exception
            r4 = r8
            r9 = r4
        L_0x02e8:
            java.lang.String r10 = "tl7"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x031a }
            r11.<init>(r1)     // Catch:{ all -> 0x031a }
            r11.append(r3)     // Catch:{ all -> 0x031a }
            java.lang.String r1 = r11.toString()     // Catch:{ all -> 0x031a }
            udd.s(r10, r1, r0)     // Catch:{ all -> 0x031a }
            goto L_0x02dc
        L_0x02fa:
            vb5 r0 = new vb5
            if (r9 == 0) goto L_0x0302
            int r1 = r9.x
            r12 = r1
            goto L_0x0303
        L_0x0302:
            r12 = r7
        L_0x0303:
            if (r9 == 0) goto L_0x0307
            int r7 = r9.y
        L_0x0307:
            r13 = r7
            int r14 = (int) r5
            java.lang.String r15 = r2.a
            r11 = 3
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            xb5 r1 = new xb5
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.<init>(r8, r0)
            return r1
        L_0x031a:
            r0 = move-exception
            defpackage.x87.A0(r4)
            throw r0
        L_0x031f:
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0330
            boolean r0 = lp.o(r0)
            if (r0 == 0) goto L_0x0330
            r7 = r9
        L_0x0330:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L_0x0335:
            java.lang.Object r0 = r0.b
            ru.ok.android.externcalls.sdk.id.InternalIdsResolver r0 = (ru.ok.android.externcalls.sdk.id.InternalIdsResolver) r0
            java.util.Set r0 = r0.lambda$resolveIdsAndGetFailed$0()
            return r0
        L_0x033e:
            java.lang.Object r0 = r0.b
            e3 r0 = (defpackage.e3) r0
            java.lang.Object r0 = r0.a
            androidx.work.impl.WorkDatabase r0 = (androidx.work.impl.WorkDatabase) r0
            b2b r1 = r0.u()
            java.lang.String r2 = "next_alarm_manager_id"
            java.lang.Long r1 = r1.z(r2)
            if (r1 == 0) goto L_0x0358
            long r3 = r1.longValue()
            int r1 = (int) r3
            goto L_0x0359
        L_0x0358:
            r1 = r7
        L_0x0359:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L_0x035f
            goto L_0x0361
        L_0x035f:
            int r7 = r1 + 1
        L_0x0361:
            b2b r0 = r0.u()
            a2b r3 = new a2b
            long r4 = (long) r7
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.<init>(r2, r4)
            r0.B(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0377:
            java.lang.Object r0 = r0.b
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.lang.Object r8 = r0.call()     // Catch:{ InterruptedException -> 0x038a, IllegalStateException -> 0x0380 }
            goto L_0x0389
        L_0x0380:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "Fresco"
            java.lang.String r2 = "failed to execute fresco task"
            udd.S(r0, r2, r1)
        L_0x0389:
            return r8
        L_0x038a:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x038d:
            java.lang.Object r0 = r0.b
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            p95 r0 = (defpackage.p95) r0
            return r0
        L_0x0398:
            java.lang.String r1 = "OKRTCCall"
            java.lang.Object r0 = r0.b
            r2 = r0
            w4g r2 = (w4g) r2
            java.lang.Object r0 = r2.b
            r3 = r0
            xwb r3 = (defpackage.xwb) r3
            int r4 = android.media.MediaCodecList.getCodecCount()
            r5 = r7
        L_0x03a9:
            if (r5 >= r4) goto L_0x040b
            android.media.MediaCodecInfo r0 = android.media.MediaCodecList.getCodecInfoAt(r5)     // Catch:{ Exception -> 0x0400 }
            java.lang.String r6 = r0.getName()     // Catch:{ Exception -> 0x0400 }
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0400 }
            java.lang.String r6 = r6.toLowerCase(r10)     // Catch:{ Exception -> 0x0400 }
            java.lang.String[] r10 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x0400 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0400 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0400 }
            r11.<init>()     // Catch:{ Exception -> 0x0400 }
            java.lang.String r12 = "codec="
            r11.append(r12)     // Catch:{ Exception -> 0x0400 }
            r11.append(r0)     // Catch:{ Exception -> 0x0400 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0400 }
            r3.log(r1, r0)     // Catch:{ Exception -> 0x0400 }
            int r0 = r10.length     // Catch:{ Exception -> 0x0400 }
            r11 = r7
        L_0x03d9:
            if (r11 >= r0) goto L_0x0409
            r12 = r10[r11]     // Catch:{ Exception -> 0x0400 }
            java.lang.String r13 = "avc"
            boolean r12 = h0e.R(r12, r13, r7)     // Catch:{ Exception -> 0x0400 }
            if (r12 == 0) goto L_0x0402
            java.lang.Object r12 = r2.c     // Catch:{ Exception -> 0x0400 }
            axb r12 = (defpackage.axb) r12     // Catch:{ Exception -> 0x0400 }
            tqd r13 = defpackage.tqd.app_event     // Catch:{ Exception -> 0x0400 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0400 }
            r14.<init>()     // Catch:{ Exception -> 0x0400 }
            java.lang.String r15 = "rtc.enc.hw."
            r14.append(r15)     // Catch:{ Exception -> 0x0400 }
            r14.append(r6)     // Catch:{ Exception -> 0x0400 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0400 }
            r12.log((defpackage.tqd) r13, (java.lang.String) r14, (java.lang.String) r8)     // Catch:{ Exception -> 0x0400 }
            goto L_0x0402
        L_0x0400:
            r0 = move-exception
            goto L_0x0404
        L_0x0402:
            int r11 = r11 + r9
            goto L_0x03d9
        L_0x0404:
            java.lang.String r6 = "codec.log"
            r3.reportException(r1, r6, r0)
        L_0x0409:
            int r5 = r5 + r9
            goto L_0x03a9
        L_0x040b:
            jue r0 = jue.a
            return r0
        L_0x040e:
            java.lang.Object r0 = r0.b
            r10 = r0
            uv0 r10 = (defpackage.uv0) r10
            r10.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.LinkedHashSet r12 = defpackage.uv0.l
            int r0 = r12.size()
            r11.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.i
            boolean r0 = r0.get()
            xv0 r13 = defpackage.xv0.a
            if (r0 == 0) goto L_0x042e
            r0 = r8
            goto L_0x05b8
        L_0x042e:
            ed5 r14 = r10.a
            r14.getClass()
            vbe r15 = new vbe
            zxe r0 = r14.e
            ft8 r7 = r14.f
            java.lang.String r5 = "vbe"
            r15.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r15.a = r6
            rxe r16 = defpackage.rxe.UNKNOWN     // Catch:{ all -> 0x0456 }
            ax7 r0 = r0.f()     // Catch:{ all -> 0x0456 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0456 }
            java.lang.Object r0 = r0.d(r4)     // Catch:{ all -> 0x0456 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0456 }
            goto L_0x0460
        L_0x0456:
            r0 = move-exception
            java.lang.String r4 = "getUploadsFromRepository: failed"
            udd.s(r5, r4, r0)
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0460:
            java.util.Iterator r0 = r0.iterator()
        L_0x0464:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x047e
            java.lang.Object r4 = r0.next()
            wve r4 = (defpackage.wve) r4
            fwe r8 = r4.a
            java.lang.String r8 = r8.a
            defpackage.vbe.a(r6, r8)
            java.lang.String r4 = r4.b
            defpackage.vbe.a(r6, r4)
            r8 = 0
            goto L_0x0464
        L_0x047e:
            java.lang.Object r0 = r15.a
            r4 = r0
            java.util.HashSet r4 = (java.util.HashSet) r4
            jx7 r0 = r7.a()     // Catch:{ all -> 0x0492 }
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0492 }
            java.lang.Object r0 = r0.d(r6)     // Catch:{ all -> 0x0492 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0492 }
            goto L_0x049c
        L_0x0492:
            r0 = move-exception
            java.lang.String r6 = "getMessageUploads: failed"
            udd.s(r5, r6, r0)
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x049c:
            java.util.Iterator r0 = r0.iterator()
        L_0x04a0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x04b2
            java.lang.Object r5 = r0.next()
            ys8 r5 = (defpackage.ys8) r5
            java.lang.String r5 = r5.b
            defpackage.vbe.a(r4, r5)
            goto L_0x04a0
        L_0x04b2:
            java.lang.Object r0 = r15.a
            java.util.HashSet r0 = (java.util.HashSet) r0
            yz r4 = defpackage.t52.I
            t52 r5 = r14.c
            java.util.List r4 = r5.D(r4)
            n73 r4 = ms9.j(r4)
            are r5 = new are
            r6 = 12
            r5.<init>(r6)
            ps9 r6 = new ps9
            r6.<init>(r4, r5, r9)
            are r4 = new are
            r5 = 13
            r4.<init>(r5)
            au9 r5 = new au9
            r5.<init>(r6, r4, r3)
            are r4 = new are
            r4.<init>(r2)
            au9 r6 = new au9
            r6.<init>(r5, r4, r1)
            rs9 r4 = r6.v()
            java.lang.Object r4 = r4.e()
            java.util.List r4 = (java.util.List) r4
            r0.addAll(r4)
            java.lang.Object r0 = r15.a
            java.util.HashSet r0 = (java.util.HashSet) r0
            s59 r4 = defpackage.bp8.b
            to8 r4 = r14.d
            java.util.ArrayList r4 = r4.s()
            java.util.Iterator r4 = r4.iterator()
        L_0x0501:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0532
            java.lang.Object r5 = r4.next()
            vo8 r5 = (defpackage.vo8) r5
            boolean r6 = r5.m()
            if (r6 != 0) goto L_0x0514
            goto L_0x0501
        L_0x0514:
            r6 = 0
        L_0x0515:
            int r7 = r5.b()
            if (r6 >= r7) goto L_0x0501
            jj7 r7 = r5.D0
            if (r7 == 0) goto L_0x0524
            java.lang.Object r7 = r7.a
            java.util.List r7 = (java.util.List) r7
            goto L_0x0525
        L_0x0524:
            r7 = 0
        L_0x0525:
            java.lang.Object r7 = r7.get(r6)
            o10 r7 = (defpackage.o10) r7
            java.lang.String r7 = r7.r
            defpackage.vbe.a(r0, r7)
            int r6 = r6 + r9
            goto L_0x0515
        L_0x0532:
            java.lang.Object r0 = r15.a
            java.util.HashSet r0 = (java.util.HashSet) r0
            j3f r4 = r14.g
            java.util.HashMap r4 = r4.i
            java.util.Set r4 = r4.keySet()
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0546:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0558
            java.lang.Object r5 = r4.next()
            a3f r5 = (defpackage.a3f) r5
            java.lang.String r5 = r5.a
            defpackage.vbe.a(r0, r5)
            goto L_0x0546
        L_0x0558:
            gvf r0 = new gvf
            dd5 r4 = r14.j
            r4.getClass()
            r0.<init>(r2, r15)
            gd5 r2 = r14.h
            java.io.File r4 = r2.a(r13)
            r5 = 0
            java.util.List r4 = r14.a(r4, r5, r0)
            java.util.List r5 = r2.j
            if (r5 != 0) goto L_0x0589
            bf5 r5 = r2.a
            mg5 r5 = (defpackage.mg5) r5
            android.content.Context r5 = r5.c
            java.io.File r6 = r5.getExternalCacheDir()
            java.io.File r5 = r5.getFilesDir()
            java.io.File[] r5 = new java.io.File[]{r6, r5}
            java.util.List r5 = java.util.Arrays.asList(r5)
            r2.j = r5
        L_0x0589:
            java.util.List r5 = r2.j
            if (r5 == 0) goto L_0x05ac
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x05ac
            java.util.Iterator r5 = r5.iterator()
        L_0x0597:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x05ac
            java.lang.Object r6 = r5.next()
            java.io.File r6 = (java.io.File) r6
            r7 = 0
            java.util.List r6 = r14.a(r6, r7, r0)
            r4.addAll(r6)
            goto L_0x0597
        L_0x05ac:
            xb4 r0 = r14.a
            java.util.Collections.sort(r4, r0)
            duf r0 = new duf
            fd5 r5 = r14.i
            r0.<init>(r4, r5, r2)
        L_0x05b8:
            java.util.Iterator r2 = r12.iterator()
            r4 = 0
        L_0x05be:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x06aa
            java.lang.Object r6 = r2.next()
            xv0 r6 = (defpackage.xv0) r6
            xv0 r7 = defpackage.xv0.Y
            if (r6 != r7) goto L_0x05cf
            goto L_0x05be
        L_0x05cf:
            if (r0 != 0) goto L_0x05d6
            r17 = r4
            r14 = 0
            goto L_0x0601
        L_0x05d6:
            java.lang.Object r8 = r0.a
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r14 = 0
        L_0x05e0:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x05ff
            java.lang.Object r12 = r8.next()
            jv0 r12 = (defpackage.jv0) r12
            if (r6 == r13) goto L_0x05f2
            xv0 r1 = r12.d     // Catch:{ all -> 0x05f5 }
            if (r1 != r6) goto L_0x05f5
        L_0x05f2:
            r17 = r4
            goto L_0x05f7
        L_0x05f5:
            r1 = 3
            goto L_0x05e0
        L_0x05f7:
            long r3 = r12.b
            long r14 = r14 + r3
            r4 = r17
            r1 = 3
            r3 = 2
            goto L_0x05e0
        L_0x05ff:
            r17 = r4
        L_0x0601:
            xv0 r3 = defpackage.xv0.x0
            if (r6 != r3) goto L_0x0636
            if (r0 != 0) goto L_0x060c
            r19 = r2
            r4 = 0
            goto L_0x0633
        L_0x060c:
            java.lang.Object r3 = r0.a
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0616:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0631
            java.lang.Object r8 = r3.next()
            jv0 r8 = (defpackage.jv0) r8
            xv0 r12 = r8.d     // Catch:{ all -> 0x062e }
            if (r12 != r7) goto L_0x062e
            r19 = r2
            long r1 = r8.b
            long r4 = r4 + r1
        L_0x062b:
            r2 = r19
            goto L_0x0616
        L_0x062e:
            r19 = r2
            goto L_0x062b
        L_0x0631:
            r19 = r2
        L_0x0633:
            long r14 = r14 + r4
        L_0x0634:
            r1 = 0
            goto L_0x0639
        L_0x0636:
            r19 = r2
            goto L_0x0634
        L_0x0639:
            java.lang.String r2 = defpackage.dhe.w(r14, r9, r1)
            cv0 r1 = new cv0
            int r3 = r6.ordinal()
            hvf r4 = r10.d
            if (r3 == r9) goto L_0x0690
            r5 = 2
            if (r3 == r5) goto L_0x0685
            r7 = 3
            if (r3 == r7) goto L_0x067b
            r8 = 4
            if (r3 == r8) goto L_0x0671
            r8 = 6
            if (r3 == r8) goto L_0x0668
            r12 = 7
            if (r3 == r12) goto L_0x065f
            android.content.Context r3 = r4.a
            int r4 = defpackage.cic.L0
            java.lang.String r3 = r3.getString(r4)
            goto L_0x069b
        L_0x065f:
            android.content.Context r3 = r4.a
            int r4 = defpackage.cic.N0
            java.lang.String r3 = r3.getString(r4)
            goto L_0x069b
        L_0x0668:
            android.content.Context r3 = r4.a
            int r4 = defpackage.cic.K0
            java.lang.String r3 = r3.getString(r4)
            goto L_0x069b
        L_0x0671:
            r8 = 6
            android.content.Context r3 = r4.a
            int r4 = defpackage.cic.M0
            java.lang.String r3 = r3.getString(r4)
            goto L_0x069b
        L_0x067b:
            r8 = 6
            android.content.Context r3 = r4.a
            int r4 = defpackage.cic.I0
            java.lang.String r3 = r3.getString(r4)
            goto L_0x069b
        L_0x0685:
            r7 = 3
            r8 = 6
            android.content.Context r3 = r4.a
            int r4 = defpackage.cic.H0
            java.lang.String r3 = r3.getString(r4)
            goto L_0x069b
        L_0x0690:
            r5 = 2
            r7 = 3
            r8 = 6
            android.content.Context r3 = r4.a
            int r4 = defpackage.cic.J0
            java.lang.String r3 = r3.getString(r4)
        L_0x069b:
            r1.<init>(r3, r6, r2, r9)
            r11.add(r1)
            long r1 = r17 + r14
            r3 = r5
            r4 = r1
            r1 = r7
            r2 = r19
            goto L_0x05be
        L_0x06aa:
            r17 = r4
            sv0 r1 = new sv0
            r2 = 0
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x06bd
            r4 = r17
            r2 = 0
            r3 = 0
            java.lang.String r2 = defpackage.dhe.w(r4, r3, r2)
            goto L_0x06bf
        L_0x06bd:
            java.lang.String r2 = "0 KB"
        L_0x06bf:
            r1.<init>(r0, r2, r11)
            return r1
        L_0x06c3:
            java.lang.Object r0 = r0.b
            ys0 r0 = (ys0) r0
            mod r1 = r0.g
            r1.x()
            cd5 r0 = r0.a
            ci4 r0 = (ci4) r0
            r0.a()
            r1 = 0
            return r1
        L_0x06d5:
            int r1 = ru.ok.messages.views.ActAvatarCrop.h1
            java.lang.Object r0 = r0.b
            ru.ok.messages.views.ActAvatarCrop r0 = (ru.ok.messages.views.ActAvatarCrop) r0
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "ru.ok.tamtam.extra.URI"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            android.graphics.Bitmap r1 = xs7.t(r1)
            boolean r2 = r0.g1
            if (r2 == 0) goto L_0x06f4
            int r2 = r1.getHeight()
            goto L_0x06f8
        L_0x06f4:
            int r2 = r1.getWidth()
        L_0x06f8:
            boolean r3 = r0.g1
            if (r3 == 0) goto L_0x0701
            int r3 = r1.getWidth()
            goto L_0x0705
        L_0x0701:
            int r3 = r1.getHeight()
        L_0x0705:
            android.graphics.Bitmap$Config r4 = r1.getConfig()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            boolean r5 = r0.g1
            android.graphics.Matrix r6 = r0.f1
            if (r5 == 0) goto L_0x0728
            float r5 = (float) r2
            int r7 = r1.getWidth()
            float r7 = (float) r7
            float r5 = r5 - r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r7
            float r3 = (float) r3
            int r8 = r1.getHeight()
            float r8 = (float) r8
            float r3 = r3 - r8
            float r3 = r3 / r7
            r6.postTranslate(r5, r3)
        L_0x0728:
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r4)
            r5 = 0
            r3.drawBitmap(r1, r6, r5)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r6 = "ru.ok.tamtam.extra.FILE_PATH"
            java.lang.String r3 = r3.getStringExtra(r6)
            v2b r6 = r0.O0
            java.lang.Object r6 = r6.b
            k93 r6 = (defpackage.k93) r6
            o2a r6 = (o2a) r6
            j2b r6 = r6.n()
            yzc r6 = r6.b
            at7.O(r3, r4, r6)
            r1.recycle()
            r4.recycle()
            ru.ok.messages.views.widgets.AvatarCropView r1 = r0.Y0
            bwf r1 = r1.getZoomableController()
            kw3 r1 = (defpackage.kw3) r1
            android.graphics.Rect r1 = r1.c(r2)
            android.graphics.Point r2 = r0.e1
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r1.toString()
            int r4 = r1.width()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r6 = r1.height()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r6}
            java.lang.String r3 = "ru.ok.messages.views.ActAvatarCrop"
            java.lang.String r4 = "image crop finished, image size: %s, cropped bounds: %s, cropped width: %d, cropped height: %d"
            udd.p(r3, r4, r2)
            v2b r2 = r0.O0
            java.lang.Object r2 = r2.b
            k93 r2 = (defpackage.k93) r2
            o2a r2 = (o2a) r2
            j2b r2 = r2.n()
            yzc r2 = r2.b
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f77minimagesidesize
            r4 = 64
            long r6 = (long) r4
            long r2 = r2.o(r3, r6)
            int r2 = (int) r2
            int r3 = r1.width()
            if (r3 < r2) goto L_0x07ad
            int r3 = r1.height()
            if (r3 >= r2) goto L_0x07ab
            goto L_0x07ad
        L_0x07ab:
            r8 = r1
            goto L_0x07b7
        L_0x07ad:
            int r1 = defpackage.cic.C1
            java.lang.String r1 = r0.getString(r1)
            a06.H(r9, r0, r1)
            r8 = r5
        L_0x07b7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.call():java.lang.Object");
    }
}
