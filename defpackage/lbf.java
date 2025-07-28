package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lbf  reason: default package */
public final class lbf extends z {
    public static final Parcelable.Creator<lbf> CREATOR = new y(12);
    public final ClassLoader X;
    public int c;
    public Parcelable o;

    public lbf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? lbf.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.o = parcel.readParcelable(classLoader);
        this.X = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return wn6.j(sb, this.c, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.o, i);
    }
}
