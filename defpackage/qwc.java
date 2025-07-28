package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qwc  reason: default package */
public final class qwc implements Parcelable {
    public static final Parcelable.Creator<qwc> CREATOR = new x3b(19);
    public final String X;
    public final RectF Y;
    public final Rect Z;
    public final yk7 a;
    public final boolean b;
    public final Uri c;
    public final Uri o;
    public final Uri w0;

    public qwc(yk7 yk7, boolean z, Uri uri, Uri uri2, String str, RectF rectF, Rect rect, Uri uri3) {
        this.a = yk7;
        this.b = z;
        this.c = uri;
        this.o = uri2;
        this.X = str;
        this.Y = rectF;
        this.Z = rect;
        this.w0 = uri3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwc)) {
            return false;
        }
        qwc qwc = (qwc) obj;
        return hhd.f(this.a, qwc.a) && this.b == qwc.b && hhd.f(this.c, qwc.c) && hhd.f(this.o, qwc.o) && hhd.f(this.X, qwc.X) && hhd.f(this.Y, qwc.Y) && hhd.f(this.Z, qwc.Z) && hhd.f(this.w0, qwc.w0);
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + ((this.c.hashCode() + th2.f(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        int i = 0;
        String str = this.X;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RectF rectF = this.Y;
        int hashCode3 = (hashCode2 + (rectF == null ? 0 : rectF.hashCode())) * 31;
        Rect rect = this.Z;
        int hashCode4 = (hashCode3 + (rect == null ? 0 : rect.hashCode())) * 31;
        Uri uri = this.w0;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "SelectedLocalMediaItem(localMediaItem=" + this.a + ", isFile=" + this.b + ", photoEditorUri=" + this.c + ", thumbnail=" + this.o + ", photoEditorFilePath=" + this.X + ", relativeCrop=" + this.Y + ", absoluteCrop=" + this.Z + ", overlay=" + this.w0 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeString(this.X);
        parcel.writeParcelable(this.Y, i);
        parcel.writeParcelable(this.Z, i);
        parcel.writeParcelable(this.w0, i);
    }
}
