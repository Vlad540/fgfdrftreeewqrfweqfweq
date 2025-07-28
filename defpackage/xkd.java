package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: xkd  reason: default package */
public final class xkd implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ xkd(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object, jod] */
    /* JADX WARNING: type inference failed for: r4v11, types: [kod, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new ykd(parcel);
            case 1:
                return new zkd(parcel);
            case 2:
                return new umd(parcel);
            case 3:
                return new vmd(parcel);
            case 4:
                return new Object();
            case 5:
                return new Object();
            case 6:
                return new cnd(parcel);
            case 7:
                return new dnd(parcel);
            case 8:
                ? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                obj.o = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj;
            case 9:
                ? obj2 = new Object();
                obj2.a = parcel.readInt();
                obj2.b = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj2.c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj2.o = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj2.X = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj2.Y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z2 = false;
                obj2.w0 = parcel.readInt() == 1;
                obj2.x0 = parcel.readInt() == 1;
                if (parcel.readInt() == 1) {
                    z2 = true;
                }
                obj2.y0 = z2;
                obj2.Z = parcel.readArrayList(jod.class.getClassLoader());
                return obj2;
            case 10:
                return kpd.valueOf(parcel.readString());
            case 11:
                return new hzd(parcel);
            case 12:
                return new izd(parcel);
            case 13:
                SparseArray sparseArray = new SparseArray();
                int readInt4 = parcel.readInt();
                for (int i = 0; i < readInt4; i++) {
                    sparseArray.put(parcel.readInt(), parcel.readString());
                }
                return new e0e(sparseArray);
            case 14:
                return new nfe(parcel);
            case 15:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new ofe(readString, readString2, ws6.k(createStringArray));
            case 16:
                return new zie(parcel.readInt());
            case 17:
                return new gje(parcel.readLong(), parcel.readLong());
            case 18:
                return new hje(parcel.readLong(), parcel.readLong());
            case 19:
                return new poe(parcel);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return new ooe(parcel);
            case 21:
                return new iye(parcel);
            case 22:
                return new jye(parcel);
            case 23:
                parcel.readInt();
                return p2f.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new q2f(n2f.valueOf(parcel.readString()));
            case 25:
                parcel.readInt();
                return u7f.a;
            case 26:
                return new v7f(qjb.valueOf(parcel.readString()));
            case 27:
                return new ydf(parcel);
            case 28:
                return new wdf(parcel);
            default:
                return new wdf(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ykd[i];
            case 1:
                return new zkd[i];
            case 2:
                return new umd[i];
            case 3:
                return new vmd[i];
            case 4:
                return new wmd[i];
            case 5:
                return new xmd[i];
            case 6:
                return new cnd[i];
            case 7:
                return new dnd[i];
            case 8:
                return new jod[i];
            case 9:
                return new kod[i];
            case 10:
                return new kpd[i];
            case 11:
                return new hzd[i];
            case 12:
                return new izd[i];
            case 13:
                return new e0e[i];
            case 14:
                return new nfe[i];
            case 15:
                return new ofe[i];
            case 16:
                return new zie[i];
            case 17:
                return new gje[i];
            case 18:
                return new hje[i];
            case 19:
                return new poe[i];
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return new ooe[i];
            case 21:
                return new iye[i];
            case 22:
                return new jye[i];
            case 23:
                return new p2f[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new q2f[i];
            case 25:
                return new u7f[i];
            case 26:
                return new v7f[i];
            case 27:
                return new vdf[i];
            case 28:
                return new wdf[i];
            default:
                return new xdf[i];
        }
    }
}
