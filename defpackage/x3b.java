package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: x3b  reason: default package */
public final class x3b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ x3b(int i) {
        this.a = i;
    }

    public final Object createFromParcel(Parcel parcel) {
        int i;
        Parcel parcel2 = parcel;
        switch (this.a) {
            case 0:
                return new y3b(parcel2);
            case 1:
                return new z3b(parcel2);
            case 2:
                return new b4b(parcel2);
            case 3:
                return new c4b(parcel2);
            case 4:
                return r6b.valueOf(parcel.readString());
            case 5:
                return b7b.valueOf(parcel.readString());
            case 6:
                return c8b.valueOf(parcel.readString());
            case 7:
                return d8b.valueOf(parcel.readString());
            case 8:
                return new ejb(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readLong(), (ti2) ti2.CREATOR.createFromParcel(parcel2));
            case 9:
                return new ujb(new rjb(qjb.values()[parcel.readInt()], parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), Byte.valueOf(parcel.readByte()).equals(1)));
            case 10:
                return new dyb(parcel.readInt(), parcel.readFloat());
            case 11:
                return new z7c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 12:
                int e0 = iu7.e0(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < e0) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        iu7.Y(parcel2, readInt);
                    } else {
                        bundle = iu7.j(parcel2, readInt);
                    }
                }
                iu7.r(parcel2, e0);
                return new v8c(bundle);
            case 13:
                return new yac(parcel.readInt());
            case 14:
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList2.add(parcel2.readBundle(ugc.class.getClassLoader()));
                }
                int readInt4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                return new ugc(arrayList, arrayList2, arrayList3, parcel.readInt());
            case 15:
                return new zlc(parcel2.readParcelable(zlc.class.getClassLoader()));
            case 16:
                return new amc((k04) k04.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel2.readParcelable(amc.class.getClassLoader()));
            case 17:
                return new inc(parcel.readString());
            case 18:
                Class<trc> cls = trc.class;
                return new trc((ForegroundColorSpan) parcel2.readParcelable(cls.getClassLoader()), (BackgroundColorSpan) parcel2.readParcelable(cls.getClassLoader()));
            case 19:
                Class<qwc> cls2 = qwc.class;
                return new qwc((yk7) yk7.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, (Uri) parcel2.readParcelable(cls2.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()), parcel.readString(), (RectF) parcel2.readParcelable(cls2.getClassLoader()), (Rect) parcel2.readParcelable(cls2.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()));
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                int readInt5 = parcel.readInt();
                mge readParcelable = parcel2.readParcelable(a6d.class.getClassLoader());
                String readString = parcel.readString();
                if (readString != null) {
                    if (readString.equals("LINK")) {
                        i = 1;
                    } else if (readString.equals("NEUTRAL")) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("No enum constant one.me.settings.SettingsAvatarBottomSheet.Button.Type.".concat(readString));
                    }
                    return new a6d(readInt5, i, readParcelable);
                }
                throw new NullPointerException("Name is null");
            case 21:
                parcel.readInt();
                return w6d.a;
            case 22:
                return new x6d(parcel2.readParcelable(x6d.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 23:
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new y6d(z2, z);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new z6d(z4, z3);
            case 25:
                return new a7d(parcel2.readParcelable(a7d.class.getClassLoader()));
            case 26:
                ArrayList arrayList4 = new ArrayList();
                parcel2.readList(arrayList4, zjd.class.getClassLoader());
                return new bkd(arrayList4);
            case 27:
                ArrayList arrayList5 = new ArrayList();
                parcel2.readList(arrayList5, akd.class.getClassLoader());
                return new ckd(arrayList5);
            case 28:
                return new zjd(parcel.readLong(), parcel.readLong(), parcel.readInt());
            default:
                return new akd(parcel.readLong(), parcel.readLong(), parcel.readInt());
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new y3b[i];
            case 1:
                return new z3b[i];
            case 2:
                return new b4b[i];
            case 3:
                return new c4b[i];
            case 4:
                return new r6b[i];
            case 5:
                return new b7b[i];
            case 6:
                return new c8b[i];
            case 7:
                return new d8b[i];
            case 8:
                return new ejb[i];
            case 9:
                return new ujb[i];
            case 10:
                return new dyb[i];
            case 11:
                return new z7c[i];
            case 12:
                return new v8c[i];
            case 13:
                return new yac[i];
            case 14:
                return new ugc[i];
            case 15:
                return new zlc[i];
            case 16:
                return new amc[i];
            case 17:
                return new inc[i];
            case 18:
                return new trc[i];
            case 19:
                return new qwc[i];
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return new a6d[i];
            case 21:
                return new w6d[i];
            case 22:
                return new x6d[i];
            case 23:
                return new y6d[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new z6d[i];
            case 25:
                return new a7d[i];
            case 26:
                return new bkd[i];
            case 27:
                return new ckd[i];
            case 28:
                return new zjd[i];
            default:
                return new akd[i];
        }
    }
}
