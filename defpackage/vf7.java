package defpackage;

import android.media.MediaDescription;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: vf7  reason: default package */
public final class vf7 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ vf7(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [tc8, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        switch (this.a) {
            case 0:
                return new eg7(parcel2);
            case 1:
                return new qk7(parcel2);
            case 2:
                return new tk7(parcel2);
            case 3:
                long readLong = parcel.readLong();
                Class<yk7> cls = yk7.class;
                Uri uri = (Uri) parcel2.readParcelable(cls.getClassLoader());
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                long readLong2 = parcel.readLong();
                Long l = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new yk7(readLong, uri, readString, readInt, readLong2, valueOf, l, parcel.readInt(), parcel.readInt(), parcel.readLong(), (Uri) parcel2.readParcelable(cls.getClassLoader()));
            case 4:
                return new im7(parcel2);
            case 5:
                return new lt7(parcel2);
            case 6:
                View.BaseSavedState baseSavedState = new View.BaseSavedState(parcel2);
                baseSavedState.a = ((Integer) parcel2.readValue(fw7.class.getClassLoader())).intValue();
                return baseSavedState;
            case 7:
                return new ey7(parcel2);
            case 8:
                return new fy7(parcel2);
            case 9:
                return new i18(parcel2);
            case 10:
                c58 a2 = c58.a(MediaDescription.CREATOR.createFromParcel(parcel2));
                a2.getClass();
                return a2;
            case 11:
                return new a88(parcel2);
            case Protos.Attaches.Attach.PRESENT:
                return new sc8(parcel2);
            case 13:
                ? obj = new Object();
                obj.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel2);
                return obj;
            case Protos.Attaches.Attach.LOCATION:
                Parcelable readParcelable = parcel2.readParcelable((ClassLoader) null);
                readParcelable.getClass();
                return new uc8(readParcelable, (mn6) null);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                Class<xh8> cls2 = xh8.class;
                return new xh8(parcel.readInt(), (mge) parcel2.readParcelable(cls2.getClassLoader()), d7d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (b7d) parcel2.readParcelable(cls2.getClassLoader()));
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new aj8(parcel.readLong(), ch2.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case LangUtils.HASH_SEED:
                return new wo8(parcel2);
            case 18:
                return new vq8(parcel2);
            case 19:
                return new nr8(parcel2);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new y29(parcel2);
            case 21:
                return new a39(parcel2);
            case 22:
                return new t59(parcel2);
            case 23:
                return new u59(parcel2);
            case 24:
                return e69.a(parcel.readInt(), parcel.readInt());
            case 25:
                return new o69(parcel2);
            case 26:
                return new p69(parcel2);
            case 27:
                return new u79(parcel2);
            case 28:
                return new v79(parcel2);
            default:
                return new ne9(parcel2);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new eg7[i];
            case 1:
                return new qk7[i];
            case 2:
                return new tk7[i];
            case 3:
                return new yk7[i];
            case 4:
                return new im7[i];
            case 5:
                return new lt7[i];
            case 6:
                return new fw7[i];
            case 7:
                return new ey7[i];
            case 8:
                return new fy7[i];
            case 9:
                return new i18[i];
            case 10:
                return new c58[i];
            case 11:
                return new a88[i];
            case Protos.Attaches.Attach.PRESENT:
                return new sc8[i];
            case 13:
                return new tc8[i];
            case Protos.Attaches.Attach.LOCATION:
                return new uc8[i];
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new xh8[i];
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new aj8[i];
            case LangUtils.HASH_SEED:
                return new wo8[i];
            case 18:
                return new vq8[i];
            case 19:
                return new nr8[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new y29[i];
            case 21:
                return new a39[i];
            case 22:
                return new t59[i];
            case 23:
                return new u59[i];
            case 24:
                return new e69[i];
            case 25:
                return new o69[i];
            case 26:
                return new p69[i];
            case 27:
                return new u79[i];
            case 28:
                return new v79[i];
            default:
                return new ne9[i];
        }
    }
}
