package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: h6  reason: default package */
public final class h6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ h6(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [xe0, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new i6(parcel);
            case 1:
                return new h8(parcel);
            case 2:
                return new aa(parcel.readInt(), parcel.readInt(), parcel.readString());
            case 3:
                return new tl(parcel);
            case 4:
                return new ul(parcel);
            case 5:
                View.BaseSavedState baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.a = parcel.readByte() != 0;
                return baseSavedState;
            case 6:
                String readString = parcel.readString();
                readString.getClass();
                return new vo(parcel.readInt(), readString);
            case 7:
                String readString2 = parcel.readString();
                readString2.getClass();
                return new wo(parcel.readInt(), readString2);
            case 8:
                return new id0(parcel);
            case 9:
                return new jd0(parcel);
            case 10:
                ? obj = new Object();
                obj.x0 = 255;
                obj.z0 = -2;
                obj.A0 = -2;
                obj.B0 = -2;
                obj.I0 = Boolean.TRUE;
                obj.a = parcel.readInt();
                obj.b = (Integer) parcel.readSerializable();
                obj.c = (Integer) parcel.readSerializable();
                obj.o = (Integer) parcel.readSerializable();
                obj.X = (Integer) parcel.readSerializable();
                obj.Y = (Integer) parcel.readSerializable();
                obj.Z = (Integer) parcel.readSerializable();
                obj.w0 = (Integer) parcel.readSerializable();
                obj.x0 = parcel.readInt();
                obj.y0 = parcel.readString();
                obj.z0 = parcel.readInt();
                obj.A0 = parcel.readInt();
                obj.B0 = parcel.readInt();
                obj.D0 = parcel.readString();
                obj.E0 = parcel.readString();
                obj.F0 = parcel.readInt();
                obj.H0 = (Integer) parcel.readSerializable();
                obj.J0 = (Integer) parcel.readSerializable();
                obj.K0 = (Integer) parcel.readSerializable();
                obj.L0 = (Integer) parcel.readSerializable();
                obj.M0 = (Integer) parcel.readSerializable();
                obj.N0 = (Integer) parcel.readSerializable();
                obj.O0 = (Integer) parcel.readSerializable();
                obj.R0 = (Integer) parcel.readSerializable();
                obj.P0 = (Integer) parcel.readSerializable();
                obj.Q0 = (Integer) parcel.readSerializable();
                obj.I0 = (Boolean) parcel.readSerializable();
                obj.C0 = (Locale) parcel.readSerializable();
                obj.S0 = (Boolean) parcel.readSerializable();
                return obj;
            case 11:
                View.BaseSavedState baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.a = parcel.readFloat();
                baseSavedState2.b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSavedState2.c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSavedState2.o = parcel.readFloat();
                baseSavedState2.X = parcel.createBooleanArray()[0];
                return baseSavedState2;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new bl0(parcel);
            case 13:
                return new cl0(parcel);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Class<e69> cls = e69.class;
                return new kw0(parcel.readParcelable(cls.getClassLoader()), parcel.readParcelable(cls.getClassLoader()), parcel.readParcelable(t04.class.getClassLoader()), parcel.readParcelable(cls.getClassLoader()), parcel.readInt());
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new le1(parcel.readLong(), parcel.readInt());
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                Class<vz1> cls2 = vz1.class;
                return new vz1((tk7) parcel.readParcelable(cls2.getClassLoader()), (Uri) parcel.readParcelable(cls2.getClassLoader()));
            case LangUtils.HASH_SEED /*17*/:
                Class<wz1> cls3 = wz1.class;
                return new wz1((tk7) parcel.readParcelable(cls3.getClassLoader()), (Uri) parcel.readParcelable(cls3.getClassLoader()));
            case 18:
                return new xz1((tk7) parcel.readParcelable(xz1.class.getClassLoader()), parcel.readString());
            case 19:
                return new p12(parcel);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return new q12(parcel);
            case 21:
                return new r12(parcel);
            case 22:
                return new s12(parcel);
            case 23:
                return s62.valueOf(parcel.readString());
            case 24:
                return ie2.valueOf(parcel.readString());
            case 25:
                return mi2.valueOf(parcel.readString());
            case 26:
                return ti2.valueOf(parcel.readString());
            case 27:
                return new j13(parcel.readInt());
            case 28:
                return new v33(parcel);
            default:
                return new x33(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new i6[i];
            case 1:
                return new h8[i];
            case 2:
                return new aa[i];
            case 3:
                return new tl[i];
            case 4:
                return new ul[i];
            case 5:
                return new ao[i];
            case 6:
                return new vo[i];
            case 7:
                return new wo[i];
            case 8:
                return new id0[i];
            case 9:
                return new jd0[i];
            case 10:
                return new xe0[i];
            case 11:
                return new wi0[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new bl0[i];
            case 13:
                return new cl0[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new kw0[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new le1[i];
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return new vz1[i];
            case LangUtils.HASH_SEED /*17*/:
                return new wz1[i];
            case 18:
                return new xz1[i];
            case 19:
                return new p12[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return new q12[i];
            case 21:
                return new r12[i];
            case 22:
                return new s12[i];
            case 23:
                return new s62[i];
            case 24:
                return new ie2[i];
            case 25:
                return new mi2[i];
            case 26:
                return new ti2[i];
            case 27:
                return new j13[i];
            case 28:
                return new v33[i];
            default:
                return new x33[i];
        }
    }
}
