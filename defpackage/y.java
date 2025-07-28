package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: y  reason: default package */
public final class y implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [android.view.View$BaseSavedState, wbf, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return z.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new bm(parcel, (ClassLoader) null);
            case 2:
                return new aq0(parcel, (ClassLoader) null);
            case 3:
                return new sw2(parcel, (ClassLoader) null);
            case 4:
                return new pt3(parcel, (ClassLoader) null);
            case 5:
                return new fx5(parcel, (ClassLoader) null);
            case 6:
                return new yv7(parcel, (ClassLoader) null);
            case 7:
                return new v6c(parcel, (ClassLoader) null);
            case 8:
                return new rsc(parcel, (ClassLoader) null);
            case 9:
                return new bfd(parcel, (ClassLoader) null);
            case 10:
                return new tfe(parcel, (ClassLoader) null);
            case 11:
                return new ule(parcel, (ClassLoader) null);
            case 12:
                return new lbf(parcel, (ClassLoader) null);
            default:
                ? baseSavedState = new View.BaseSavedState(parcel, (ClassLoader) null);
                baseSavedState.a = parcel.readInt();
                baseSavedState.b = parcel.readInt();
                baseSavedState.c = parcel.readParcelable((ClassLoader) null);
                return baseSavedState;
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new z[i];
            case 1:
                return new bm[i];
            case 2:
                return new aq0[i];
            case 3:
                return new sw2[i];
            case 4:
                return new pt3[i];
            case 5:
                return new fx5[i];
            case 6:
                return new yv7[i];
            case 7:
                return new v6c[i];
            case 8:
                return new rsc[i];
            case 9:
                return new bfd[i];
            case 10:
                return new tfe[i];
            case 11:
                return new ule[i];
            case 12:
                return new lbf[i];
            default:
                return new wbf[i];
        }
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [android.view.View$BaseSavedState, wbf, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return z.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new bm(parcel, classLoader);
            case 2:
                return new aq0(parcel, classLoader);
            case 3:
                return new sw2(parcel, classLoader);
            case 4:
                return new pt3(parcel, classLoader);
            case 5:
                return new fx5(parcel, classLoader);
            case 6:
                return new yv7(parcel, classLoader);
            case 7:
                return new v6c(parcel, classLoader);
            case 8:
                return new rsc(parcel, classLoader);
            case 9:
                return new bfd(parcel, classLoader);
            case 10:
                return new tfe(parcel, classLoader);
            case 11:
                return new ule(parcel, classLoader);
            case 12:
                return new lbf(parcel, classLoader);
            default:
                ? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.a = parcel.readInt();
                baseSavedState.b = parcel.readInt();
                baseSavedState.c = parcel.readParcelable(classLoader);
                return baseSavedState;
        }
    }
}
