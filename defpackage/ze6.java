package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ze6  reason: default package */
public final class ze6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ze6(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r8v15, types: [ed7, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new af6(parcel.readFloat());
            case 1:
                return new sj6(parcel);
            case 2:
                return new tj6(parcel);
            case 3:
                return new qj6(parcel);
            case 4:
                return new rj6(parcel);
            case 5:
                return new oo6(parcel);
            case 6:
                return new po6(parcel);
            case 7:
                return new qo6(parcel);
            case 8:
                return new ro6(parcel);
            case 9:
                return new jz6(parcel);
            case 10:
                return new pz6(parcel);
            case 11:
                return new qz6(parcel);
            case Protos.Attaches.Attach.PRESENT:
                return new o97(parcel);
            case 13:
                ? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                obj.c = z;
                return obj;
            case Protos.Attaches.Attach.LOCATION:
                return new wd7(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                parcel.readInt();
                return xd7.a;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new yd7(parcel.readParcelable(yd7.class.getClassLoader()).a, parcel.readString());
            case LangUtils.HASH_SEED:
                parcel.readInt();
                return zd7.a;
            case 18:
                parcel.readInt();
                return ae7.a;
            case 19:
                return new be7((Uri) parcel.readParcelable(be7.class.getClassLoader()));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new ce7(parcel.readString());
            case 21:
                return new de7(parcel.readLong(), parcel.readString());
            case 22:
                parcel.readInt();
                return ee7.a;
            case 23:
                return new fe7(parcel.readLong(), parcel.readString(), parcel.readLong());
            case 24:
                return new ge7(parcel.readLong(), parcel.readString());
            case 25:
                return new he7(parcel.readLong(), parcel.readString(), parcel.readString());
            case 26:
                parcel.readInt();
                return ie7.a;
            case 27:
                return new je7(parcel.readString());
            case 28:
                return new ke7(parcel.readLong());
            default:
                parcel.readInt();
                return me7.a;
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new af6[i];
            case 1:
                return new sj6[i];
            case 2:
                return new tj6[i];
            case 3:
                return new qj6[i];
            case 4:
                return new rj6[i];
            case 5:
                return new oo6[i];
            case 6:
                return new po6[i];
            case 7:
                return new qo6[i];
            case 8:
                return new ro6[i];
            case 9:
                return new jz6[i];
            case 10:
                return new pz6[i];
            case 11:
                return new qz6[i];
            case Protos.Attaches.Attach.PRESENT:
                return new o97[i];
            case 13:
                return new ed7[i];
            case Protos.Attaches.Attach.LOCATION:
                return new wd7[i];
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new xd7[i];
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new yd7[i];
            case LangUtils.HASH_SEED:
                return new zd7[i];
            case 18:
                return new ae7[i];
            case 19:
                return new be7[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new ce7[i];
            case 21:
                return new de7[i];
            case 22:
                return new ee7[i];
            case 23:
                return new fe7[i];
            case 24:
                return new ge7[i];
            case 25:
                return new he7[i];
            case 26:
                return new ie7[i];
            case 27:
                return new je7[i];
            case 28:
                return new ke7[i];
            default:
                return new me7[i];
        }
    }
}
