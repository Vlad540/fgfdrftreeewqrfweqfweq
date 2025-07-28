package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: npa  reason: default package */
public final class npa implements Parcelable {
    public static final Parcelable.Creator<npa> CREATOR = new ch9(23);
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;

    public npa(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.X = z5;
        this.Y = z6;
        this.Z = z7;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.npa) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.npa
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            npa r5 = (defpackage.npa) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r1 = r4.o
            boolean r3 = r5.o
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            boolean r1 = r4.X
            boolean r3 = r5.X
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            boolean r1 = r4.Y
            boolean r3 = r5.Y
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            boolean r4 = r4.Z
            boolean r5 = r5.Z
            if (r4 == r5) goto L_0x003d
            return r2
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + th2.f(th2.f(th2.f(th2.f(th2.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31, this.Y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoEditorViewState(redoVisible=");
        sb.append(this.a);
        sb.append(", undoVisible=");
        sb.append(this.b);
        sb.append(", clearVisible=");
        sb.append(this.c);
        sb.append(", drawStickerVisible=");
        sb.append(this.o);
        sb.append(", drawStickerEnabled=");
        sb.append(this.X);
        sb.append(", doneEnabled=");
        sb.append(this.Y);
        sb.append(", isRegularSending=");
        return hr1.j(sb, this.Z, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }
}
