package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.coroutines.Continuation;

/* renamed from: v9e  reason: default package */
public final class v9e extends l5e implements i26 {
    public int A0;
    public /* synthetic */ Object B0;
    public final /* synthetic */ s5c C0;
    public Closeable X;
    public s5c Y;
    public FileChannel Z;
    public l7c w0;
    public ByteBuffer x0;
    public long y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v9e(s5c s5c, Continuation continuation) {
        super(2, continuation);
        this.C0 = s5c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v9e) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v9e v9e = new v9e(this.C0, continuation);
        v9e.B0 = obj;
        return v9e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: type inference failed for: r13v5, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:36|(7:38|(1:40)|41|42|(1:54)|36|(0))|43|44|48|49|(1:51)(4:52|53|42|(0))|51) */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a A[Catch:{ all -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.A0
            jue r3 = defpackage.jue.a
            java.lang.String r4 = "<Invalid UTF-8 sequence>"
            r6 = 0
            r8 = 2
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0050
            if (r2 == r9) goto L_0x002c
            if (r2 != r8) goto L_0x0024
            java.lang.Object r0 = r0.B0
            r1 = r0
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.wx3.H(r19)     // Catch:{ all -> 0x001f }
            goto L_0x0189
        L_0x001f:
            r0 = move-exception
            r9 = r1
        L_0x0021:
            r1 = r0
            goto L_0x018f
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002c:
            int r2 = r0.z0
            long r11 = r0.y0
            java.nio.ByteBuffer r13 = r0.x0
            l7c r14 = r0.w0
            java.nio.channels.FileChannel r15 = r0.Z
            s5c r8 = r0.Y
            java.io.Closeable r9 = r0.X
            java.lang.Object r5 = r0.B0
            rj5 r5 = (defpackage.rj5) r5
            defpackage.wx3.H(r19)     // Catch:{ all -> 0x004e }
            r7 = r2
            r16 = r4
            r2 = r5
            r5 = r15
            r6 = 1
            r17 = r14
            r14 = r13
            r13 = r17
            goto L_0x0128
        L_0x004e:
            r0 = move-exception
            goto L_0x0021
        L_0x0050:
            defpackage.wx3.H(r19)
            java.lang.Object r2 = r0.B0
            rj5 r2 = (defpackage.rj5) r2
            java.io.File r5 = new java.io.File
            s5c r8 = r0.C0
            java.lang.Object r9 = r8.b
            java.lang.String r9 = (java.lang.String) r9
            r5.<init>(r9)
            boolean r9 = r5.exists()
            if (r9 == 0) goto L_0x0196
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile
            java.lang.String r11 = "r"
            r9.<init>(r5, r11)
            java.nio.channels.FileChannel r5 = r9.getChannel()     // Catch:{ all -> 0x004e }
            long r11 = r5.size()     // Catch:{ all -> 0x004e }
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x007f
            defpackage.urd.l(r9, r10)
            return r3
        L_0x007f:
            l7c r13 = new l7c     // Catch:{ all -> 0x004e }
            r13.<init>()     // Catch:{ all -> 0x004e }
            r14 = 0
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ all -> 0x004e }
            r13.a = r15     // Catch:{ all -> 0x004e }
        L_0x008b:
            int r14 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x014f
            hu3 r14 = r0.b     // Catch:{ all -> 0x004e }
            defpackage.lp.m(r14)     // Catch:{ all -> 0x004e }
            r8.getClass()     // Catch:{ all -> 0x004e }
            int r14 = (int) r11     // Catch:{ all -> 0x004e }
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r15 <= r14) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r14 = r15
        L_0x009e:
            long r6 = (long) r14     // Catch:{ all -> 0x004e }
            long r11 = r11 - r6
            r5.position(r11)     // Catch:{ all -> 0x004e }
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ all -> 0x004e }
            r5.read(r6)     // Catch:{ all -> 0x004e }
            r6.flip()     // Catch:{ all -> 0x004e }
            int r7 = r6.remaining()     // Catch:{ all -> 0x004e }
            java.lang.Object r14 = r13.a     // Catch:{ all -> 0x004e }
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14     // Catch:{ all -> 0x004e }
            int r14 = r14.remaining()     // Catch:{ all -> 0x004e }
            int r7 = r7 + r14
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)     // Catch:{ all -> 0x004e }
            r7.put(r6)     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = r13.a     // Catch:{ all -> 0x004e }
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ all -> 0x004e }
            r7.put(r6)     // Catch:{ all -> 0x004e }
            r7.flip()     // Catch:{ all -> 0x004e }
            int r6 = r7.limit()     // Catch:{ all -> 0x004e }
            r14 = r7
            r7 = r6
        L_0x00d1:
            if (r6 <= 0) goto L_0x012a
            int r15 = r6 + -1
            r14.position(r15)     // Catch:{ all -> 0x004e }
            byte r10 = r14.get()     // Catch:{ all -> 0x004e }
            r16 = r4
            r4 = 10
            if (r10 == r4) goto L_0x00ec
            r4 = 13
            if (r10 != r4) goto L_0x00e7
            goto L_0x00ec
        L_0x00e7:
            r6 = r15
        L_0x00e8:
            r4 = r16
            r10 = 0
            goto L_0x00d1
        L_0x00ec:
            int r7 = r7 - r15
            r4 = 1
            int r7 = r7 - r4
            byte[] r4 = new byte[r7]     // Catch:{ all -> 0x004e }
            r14.position(r6)     // Catch:{ all -> 0x004e }
            r14.get(r4)     // Catch:{ all -> 0x004e }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch:{ all -> 0x004e }
            r8.getClass()     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = r8.c     // Catch:{ CharacterCodingException -> 0x010b }
            java.nio.charset.CharsetDecoder r6 = (java.nio.charset.CharsetDecoder) r6     // Catch:{ CharacterCodingException -> 0x010b }
            java.nio.CharBuffer r4 = r6.decode(r4)     // Catch:{ CharacterCodingException -> 0x010b }
            java.lang.String r4 = r4.toString()     // Catch:{ CharacterCodingException -> 0x010b }
            goto L_0x010d
        L_0x010b:
            r4 = r16
        L_0x010d:
            r0.B0 = r2     // Catch:{ all -> 0x004e }
            r0.X = r9     // Catch:{ all -> 0x004e }
            r0.Y = r8     // Catch:{ all -> 0x004e }
            r0.Z = r5     // Catch:{ all -> 0x004e }
            r0.w0 = r13     // Catch:{ all -> 0x004e }
            r0.x0 = r14     // Catch:{ all -> 0x004e }
            r0.y0 = r11     // Catch:{ all -> 0x004e }
            r0.z0 = r15     // Catch:{ all -> 0x004e }
            r6 = 1
            r0.A0 = r6     // Catch:{ all -> 0x004e }
            java.lang.Object r4 = r2.a(r4, r0)     // Catch:{ all -> 0x004e }
            if (r4 != r1) goto L_0x0127
            return r1
        L_0x0127:
            r7 = r15
        L_0x0128:
            r6 = r7
            goto L_0x00e8
        L_0x012a:
            r16 = r4
            r6 = 1
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r7)     // Catch:{ all -> 0x004e }
            r13.a = r4     // Catch:{ all -> 0x004e }
            r4 = 0
            r14.position(r4)     // Catch:{ all -> 0x004e }
            r14.limit(r7)     // Catch:{ all -> 0x004e }
            java.lang.Object r7 = r13.a     // Catch:{ all -> 0x004e }
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7     // Catch:{ all -> 0x004e }
            r7.put(r14)     // Catch:{ all -> 0x004e }
            java.lang.Object r7 = r13.a     // Catch:{ all -> 0x004e }
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7     // Catch:{ all -> 0x004e }
            r7.flip()     // Catch:{ all -> 0x004e }
            r4 = r16
            r6 = 0
            r10 = 0
            goto L_0x008b
        L_0x014f:
            r16 = r4
            java.lang.Object r4 = r13.a     // Catch:{ all -> 0x004e }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ all -> 0x004e }
            boolean r4 = r4.hasRemaining()     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x018a
            java.lang.Object r4 = r13.a     // Catch:{ all -> 0x004e }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ all -> 0x004e }
            r8.getClass()     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = r8.c     // Catch:{ CharacterCodingException -> 0x016f }
            java.nio.charset.CharsetDecoder r5 = (java.nio.charset.CharsetDecoder) r5     // Catch:{ CharacterCodingException -> 0x016f }
            java.nio.CharBuffer r4 = r5.decode(r4)     // Catch:{ CharacterCodingException -> 0x016f }
            java.lang.String r4 = r4.toString()     // Catch:{ CharacterCodingException -> 0x016f }
            goto L_0x0171
        L_0x016f:
            r4 = r16
        L_0x0171:
            r0.B0 = r9     // Catch:{ all -> 0x004e }
            r5 = 0
            r0.X = r5     // Catch:{ all -> 0x004e }
            r0.Y = r5     // Catch:{ all -> 0x004e }
            r0.Z = r5     // Catch:{ all -> 0x004e }
            r0.w0 = r5     // Catch:{ all -> 0x004e }
            r0.x0 = r5     // Catch:{ all -> 0x004e }
            r5 = 2
            r0.A0 = r5     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r2.a(r4, r0)     // Catch:{ all -> 0x004e }
            if (r0 != r1) goto L_0x0188
            return r1
        L_0x0188:
            r1 = r9
        L_0x0189:
            r9 = r1
        L_0x018a:
            r0 = 0
            defpackage.urd.l(r9, r0)
            return r3
        L_0x018f:
            throw r1     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r0 = move-exception
            r2 = r0
            defpackage.urd.l(r9, r1)
            throw r2
        L_0x0196:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "File does not exist: "
            r1.<init>(r2)
            java.lang.Object r2 = r8.b
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.o(java.lang.Object):java.lang.Object");
    }
}
