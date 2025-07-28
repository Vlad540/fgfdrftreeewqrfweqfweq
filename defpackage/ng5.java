package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* renamed from: ng5  reason: default package */
public abstract class ng5 extends js {
    public static boolean J(File file) {
        lf5 lf5 = new lf5(new nf5(file));
        while (true) {
            boolean z = true;
            while (true) {
                if (!lf5.hasNext()) {
                    return z;
                }
                File file2 = (File) lf5.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.io.OutputStream, p55, java.io.ByteArrayOutputStream] */
    public static byte[] K(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ? byteArrayOutputStream = new ByteArrayOutputStream(8193);
                        byteArrayOutputStream.write(read2);
                        oyb.p(fileInputStream, byteArrayOutputStream, 8192);
                        int size = byteArrayOutputStream.size() + i;
                        if (size >= 0) {
                            byte[] m = byteArrayOutputStream.m();
                            bArr = Arrays.copyOf(bArr, size);
                            System.arraycopy(m, 0, bArr, i, byteArrayOutputStream.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                urd.l(fileInputStream, (Throwable) null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            urd.l(fileInputStream, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        defpackage.urd.l(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList L(java.io.File r6) {
        /*
            java.nio.charset.Charset r0 = defpackage.e22.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            c0 r2 = new c0
            r3 = 1
            r2.<init>(r3, r1)
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r6)
            r4.<init>(r5, r0)
            r3.<init>(r4)
            es r6 = new es     // Catch:{ all -> 0x0039 }
            r0 = 4
            r6.<init>(r0, r3)     // Catch:{ all -> 0x0039 }
            le3 r0 = new le3     // Catch:{ all -> 0x0039 }
            r0.<init>(r6)     // Catch:{ all -> 0x0039 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x002b:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0039 }
            r2.invoke(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x002b
        L_0x0039:
            r6 = move-exception
            goto L_0x0040
        L_0x003b:
            r6 = 0
            defpackage.urd.l(r3, r6)
            return r1
        L_0x0040:
            throw r6     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            defpackage.urd.l(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng5.L(java.io.File):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        defpackage.urd.l(r1, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String M(java.io.File r3) {
        /*
            java.nio.charset.Charset r0 = defpackage.e22.a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r0)
            java.lang.String r3 = defpackage.n1g.S(r1)     // Catch:{ all -> 0x0015 }
            r0 = 0
            defpackage.urd.l(r1, r0)
            return r3
        L_0x0015:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r0 = move-exception
            defpackage.urd.l(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng5.M(java.io.File):java.lang.String");
    }

    public static File N(File file, String str) {
        int i;
        File file2;
        int Z;
        File file3 = new File(str);
        String path = file3.getPath();
        char c = File.separatorChar;
        boolean z = false;
        int Z2 = h0e.Z(path, c, 0, false, 4);
        if (Z2 != 0) {
            i = (Z2 <= 0 || path.charAt(Z2 + -1) != ':') ? (Z2 != -1 || !h0e.T(path, ':')) ? 0 : path.length() : Z2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (Z = h0e.Z(path, c, 2, false, 4)) < 0) {
            i = 1;
        } else {
            int Z3 = h0e.Z(path, c, Z + 1, false, 4);
            i = Z3 >= 0 ? Z3 + 1 : path.length();
        }
        if (i > 0) {
            return file3;
        }
        String file4 = file.toString();
        if (file4.length() == 0) {
            z = true;
        }
        if (z || h0e.T(file4, c)) {
            file2 = new File(file4 + file3);
        } else {
            file2 = new File(file4 + c + file3);
        }
        return file2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        defpackage.urd.l(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void O(java.io.File r2, java.lang.String r3) {
        /*
            java.nio.charset.Charset r0 = defpackage.e22.a
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            P(r1, r3, r0)     // Catch:{ all -> 0x000f }
            r2 = 0
            defpackage.urd.l(r1, r2)
            return
        L_0x000f:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r3 = move-exception
            defpackage.urd.l(r1, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng5.O(java.io.File, java.lang.String):void");
    }

    public static final void P(FileOutputStream fileOutputStream, String str, Charset charset) {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) ((float) Math.ceil((double) onUnmappableCharacter.maxBytesPerChar()))));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            str.getChars(i, i3, allocate.array(), i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (onUnmappableCharacter.encode(allocate, allocate2, i3 == str.length()).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i2 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i = i3;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }
}
