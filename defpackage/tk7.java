package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tk7  reason: default package */
public class tk7 extends o2 implements Parcelable {
    public static final Parcelable.Creator<tk7> CREATOR = new vf7(2);
    public final int X;
    public final long Y;
    public final String Z;
    public final long b;
    public final String c;
    public final String o;
    public final long w0;
    public Uri x0;

    public tk7(int i, long j, String str, String str2, int i2, long j2, String str3, long j3, Uri uri) {
        super(i);
        this.b = j;
        this.c = str;
        this.o = str2;
        this.X = i2;
        this.Y = j2;
        this.Z = str3;
        this.w0 = j3;
        this.x0 = uri;
    }

    public String a() {
        Uri uri = this.x0;
        return uri != null ? uri.toString() : this.c;
    }

    public Uri c() {
        Uri uri = this.x0;
        if (uri != null) {
            return uri;
        }
        try {
            Uri parse = Uri.parse(this.c);
            this.x0 = parse;
            return parse;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean d() {
        if (this.a != 1) {
            return false;
        }
        String str = this.Z;
        return str != null ? p0e.Q(str, us8.f(5), true) : false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        r1g.H(parcel, this.c);
        r1g.H(parcel, this.o);
        parcel.writeInt(this.X);
        parcel.writeLong(this.Y);
        parcel.writeString(this.Z);
        parcel.writeLong(this.w0);
        Uri uri = this.x0;
        byte b2 = uri != null ? (byte) 1 : 0;
        parcel.writeByte(b2);
        if (b2 != 0) {
            parcel.writeParcelable(uri, i);
        }
    }

    /* JADX WARNING: type inference failed for: r15v3, types: [android.os.Parcelable] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tk7(android.os.Parcel r15) {
        /*
            r14 = this;
            int r1 = r15.readInt()
            long r2 = r15.readLong()
            java.lang.String r4 = r1g.B(r15)
            java.lang.String r5 = r1g.B(r15)
            int r6 = r15.readInt()
            long r7 = r15.readLong()
            java.lang.String r9 = r15.readString()
            long r10 = r15.readLong()
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            byte r12 = r15.readByte()
            r13 = 1
            if (r12 != r13) goto L_0x0032
            android.os.Parcelable r15 = r15.readParcelable(r0)
            goto L_0x0033
        L_0x0032:
            r15 = 0
        L_0x0033:
            r12 = r15
            android.net.Uri r12 = (android.net.Uri) r12
            r0 = r14
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk7.<init>(android.os.Parcel):void");
    }
}
