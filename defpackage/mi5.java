package defpackage;

/* renamed from: mi5  reason: default package */
public final class mi5 extends ll0 {
    public static int f(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
