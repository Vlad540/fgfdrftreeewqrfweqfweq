package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: ch9  reason: default package */
public final class ch9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ch9(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View$BaseSavedState, dh9, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        switch (this.a) {
            case 0:
                ? baseSavedState = new View.BaseSavedState(parcel2);
                baseSavedState.a = parcel.readInt();
                return baseSavedState;
            case 1:
                return new mi9(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            case 2:
                return new ay9(parcel2);
            case 3:
                return new v3a(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 4:
                return new oba(parcel.readInt());
            case 5:
                return new pba(((oba) oba.CREATOR.createFromParcel(parcel2)).a, parcel.readInt(), parcel.readInt(), 0);
            case 6:
                Class<fca> cls = fca.class;
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new fca(parcel2.readParcelable(cls.getClassLoader()), (CharSequence) creator.createFromParcel(parcel2), (CharSequence) creator.createFromParcel(parcel2), parcel2.readParcelable(cls.getClassLoader()), (pba) pba.CREATOR.createFromParcel(parcel2), parcel2.readParcelable(cls.getClassLoader()));
            case 7:
                parcel.readInt();
                return qba.b;
            case 8:
                parcel.readInt();
                return rba.b;
            case 9:
                parcel.readInt();
                return sba.b;
            case 10:
                return new uba(parcel.readInt(), parcel.readInt());
            case 11:
                return new vba(parcel.readInt());
            case 12:
                parcel.readInt();
                return wba.a;
            case 13:
                return new xba(parcel.readInt());
            case 14:
                parcel.readInt();
                return yba.a;
            case 15:
                parcel.readInt();
                return aca.a;
            case 16:
                parcel.readInt();
                return bca.a;
            case 17:
                parcel.readInt();
                return cca.a;
            case 18:
                return new dca(parcel2.readParcelable(dca.class.getClassLoader()));
            case 19:
                return new ParcelImpl(parcel2);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return new gja(parcel2);
            case 21:
                return new hma(parcel.readString(), parcel.createStringArray(), parcel.readInt());
            case 22:
                Class<Uri> cls2 = Uri.class;
                return new kpa((Uri) parcel2.readParcelable(cls2.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()), (jw3) parcel2.readParcelable(jw3.class.getClassLoader()), parcel2.readParcelable(js4.class.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()));
            case 23:
                return new npa(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new nua(parcel2);
            case 25:
                return new oua(parcel2);
            case 26:
                return new cya(parcel2);
            case 27:
                return new bya(parcel2);
            case 28:
                return new r2b(parcel2);
            default:
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(mi9.CREATOR.createFromParcel(parcel2));
                }
                return new y2b(linkedHashMap, arrayList, (mi9) (parcel.readInt() == 0 ? null : mi9.CREATOR.createFromParcel(parcel2)));
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dh9[i];
            case 1:
                return new mi9[i];
            case 2:
                return new ay9[i];
            case 3:
                return new v3a[i];
            case 4:
                return new oba[i];
            case 5:
                return new pba[i];
            case 6:
                return new fca[i];
            case 7:
                return new qba[i];
            case 8:
                return new rba[i];
            case 9:
                return new sba[i];
            case 10:
                return new uba[i];
            case 11:
                return new vba[i];
            case 12:
                return new wba[i];
            case 13:
                return new xba[i];
            case 14:
                return new yba[i];
            case 15:
                return new aca[i];
            case 16:
                return new bca[i];
            case 17:
                return new cca[i];
            case 18:
                return new dca[i];
            case 19:
                return new ParcelImpl[i];
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return new gja[i];
            case 21:
                return new hma[i];
            case 22:
                return new kpa[i];
            case 23:
                return new npa[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new nua[i];
            case 25:
                return new oua[i];
            case 26:
                return new cya[i];
            case 27:
                return new bya[i];
            case 28:
                return new r2b[i];
            default:
                return new y2b[i];
        }
    }
}
