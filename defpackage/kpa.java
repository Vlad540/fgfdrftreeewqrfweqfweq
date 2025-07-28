package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: kpa  reason: default package */
public final class kpa implements Parcelable {
    public static final Parcelable.Creator<kpa> CREATOR = new ch9(22);
    public final Uri X;
    public final Uri Y;
    public final Uri a;
    public final Uri b;
    public final jw3 c;
    public final js4 o;

    public kpa(Uri uri, Uri uri2, jw3 jw3, js4 js4, Uri uri3, Uri uri4) {
        this.a = uri;
        this.b = uri2;
        this.c = jw3;
        this.o = js4;
        this.X = uri3;
        this.Y = uri4;
    }

    public static Uri a(kpa kpa, tk7 tk7) {
        if (kpa == null) {
            return Uri.parse(tk7.a());
        }
        Uri uri = kpa.Y;
        if (uri != null) {
            return uri;
        }
        Uri uri2 = kpa.b;
        if (uri2 != null) {
            return uri2;
        }
        Uri uri3 = kpa.a;
        return uri3 != null ? uri3 : Uri.parse(tk7.a());
    }

    public static boolean b(kpa kpa, tk7 tk7) {
        if (kpa == null) {
            return false;
        }
        return (kpa.o == null && kpa.c == null && a(kpa, tk7).equals(Uri.parse(tk7.a()))) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, mif] */
    public final mif c() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.o = this.o;
        obj.X = this.X;
        obj.Y = this.Y;
        return obj;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kpa.class != obj.getClass()) {
            return false;
        }
        kpa kpa = (kpa) obj;
        if (Objects.equals(this.a, kpa.a) && Objects.equals(this.b, kpa.b) && Objects.equals(this.c, kpa.c) && Objects.equals(this.o, kpa.o) && Objects.equals(this.X, kpa.X)) {
            return Objects.equals(this.Y, kpa.Y);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        jw3 jw3 = this.c;
        int hashCode3 = (hashCode2 + (jw3 != null ? jw3.hashCode() : 0)) * 31;
        js4 js4 = this.o;
        int hashCode4 = (hashCode3 + (js4 != null ? js4.hashCode() : 0)) * 31;
        Uri uri3 = this.X;
        int hashCode5 = (hashCode4 + (uri3 != null ? uri3.hashCode() : 0)) * 31;
        Uri uri4 = this.Y;
        if (uri4 != null) {
            i = uri4.hashCode();
        }
        return hashCode5 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.X, i);
        parcel.writeParcelable(this.Y, i);
    }
}
