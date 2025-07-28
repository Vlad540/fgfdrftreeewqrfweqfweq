package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: w33  reason: default package */
public final class w33 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ w33(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r10v30, types: [ej5, android.view.ViewGroup$MarginLayoutParams, n6c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v31, types: [fj5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v32, types: [java.lang.Object, qx5] */
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.a) {
            case 0:
                return new y33(parcel);
            case 1:
                int readInt = parcel.readInt();
                mge readParcelable = parcel.readParcelable(kc3.class.getClassLoader());
                String readString = parcel.readString();
                if (readString != null) {
                    if (readString.equals("NEGATIVE")) {
                        i = 1;
                    } else if (readString.equals("NEUTRAL")) {
                        i = 2;
                    } else if (readString.equals("PRIMARY")) {
                        i = 3;
                    } else if (readString.equals("THEMED")) {
                        i = 4;
                    } else {
                        throw new IllegalArgumentException("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Type.".concat(readString));
                    }
                    return new kc3(readInt, readParcelable, i, parcel.readInt() != 0);
                }
                throw new NullPointerException("Name is null");
            case 2:
                return new yj3(parcel);
            case 3:
                return new pm3(parcel);
            case 4:
                return new jw3(parcel);
            case 5:
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList2.add(parcel.readBundle(kx3.class.getClassLoader()));
                }
                int readInt4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                return new kx3(arrayList, arrayList2, arrayList3, parcel.readInt());
            case 6:
                Parcelable.Creator creator = zie.CREATOR;
                return new k04((v04) v04.CREATOR.createFromParcel(parcel), (zie) creator.createFromParcel(parcel), (zie) creator.createFromParcel(parcel));
            case 7:
                return new t04(parcel.readLong());
            case 8:
                return new v04(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString());
            case 9:
                return new k34((Uri) parcel.readParcelable(k34.class.getClassLoader()));
            case 10:
                return new pl4(parcel);
            case 11:
                return new sn4(parcel);
            case 12:
                return new wn4(parcel);
            case 13:
                return new xn4(parcel);
            case 14:
                return new un4(parcel);
            case 15:
                return new vn4(parcel);
            case 16:
                return new js4(parcel);
            case 17:
                return new v05(parcel);
            case 18:
                return new w05(parcel);
            case 19:
                return new ei5(parcel);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                ? n6c = new n6c(-2, -2);
                n6c.X = 0.0f;
                n6c.Y = 1.0f;
                n6c.Z = -1;
                n6c.w0 = -1.0f;
                n6c.z0 = 16777215;
                n6c.A0 = 16777215;
                n6c.X = parcel.readFloat();
                n6c.Y = parcel.readFloat();
                n6c.Z = parcel.readInt();
                n6c.w0 = parcel.readFloat();
                n6c.x0 = parcel.readInt();
                n6c.y0 = parcel.readInt();
                n6c.z0 = parcel.readInt();
                n6c.A0 = parcel.readInt();
                n6c.B0 = parcel.readByte() != 0;
                n6c.bottomMargin = parcel.readInt();
                n6c.leftMargin = parcel.readInt();
                n6c.rightMargin = parcel.readInt();
                n6c.topMargin = parcel.readInt();
                n6c.height = parcel.readInt();
                n6c.width = parcel.readInt();
                return n6c;
            case 21:
                ? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                return obj;
            case 22:
                ? obj2 = new Object();
                obj2.a = parcel.readString();
                obj2.b = parcel.readInt();
                return obj2;
            case 23:
                return new wx5(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new zx5(parcel);
            case 25:
                return new d46(parcel.readInt());
            case 26:
                return new e46(parcel.readString());
            case 27:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int readInt5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt5);
                for (int i5 = 0; i5 != readInt5; i5++) {
                    arrayList4.add(parcel.readParcelable(q46.class.getClassLoader()));
                }
                return new q46(z, z2, z3, z4, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0);
            case 28:
                return new d76(parcel);
            default:
                return new e76(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new y33[i];
            case 1:
                return new kc3[i];
            case 2:
                return new yj3[i];
            case 3:
                return new pm3[i];
            case 4:
                return new jw3[i];
            case 5:
                return new kx3[i];
            case 6:
                return new k04[i];
            case 7:
                return new t04[i];
            case 8:
                return new v04[i];
            case 9:
                return new k34[i];
            case 10:
                return new pl4[i];
            case 11:
                return new sn4[i];
            case 12:
                return new wn4[i];
            case 13:
                return new xn4[i];
            case 14:
                return new un4[i];
            case 15:
                return new vn4[i];
            case 16:
                return new js4[i];
            case 17:
                return new v05[i];
            case 18:
                return new w05[i];
            case 19:
                return new ei5[i];
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return new ej5[i];
            case 21:
                return new fj5[i];
            case 22:
                return new qx5[i];
            case 23:
                return new wx5[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new zx5[i];
            case 25:
                return new d46[i];
            case 26:
                return new e46[i];
            case 27:
                return new q46[i];
            case 28:
                return new d76[i];
            default:
                return new e76[i];
        }
    }
}
