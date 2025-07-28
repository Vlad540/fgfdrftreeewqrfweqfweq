package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xsd  reason: default package */
public final /* synthetic */ class xsd implements of3, j26, lk0, v1b, z77 {
    public final /* synthetic */ int a;

    public /* synthetic */ xsd(int i) {
        this.a = i;
    }

    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                ((List) obj).addAll((List) obj2);
                return;
            default:
                ((ArrayList) obj).addAll((List) obj2);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v20, types: [vtd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v23, types: [cud, java.lang.Object] */
    public Object apply(Object obj) {
        hx7 hx7 = hx7.a;
        switch (this.a) {
            case 1:
                return (osd) ((Map.Entry) obj).getValue();
            case 5:
                return ((ht) obj).c;
            case 6:
                ArrayList arrayList = new ArrayList();
                for (psd r : (List) obj) {
                    arrayList.add(fu7.r(r));
                }
                return arrayList;
            case 9:
                return Long.valueOf(((utd) obj).c);
            case 13:
                return ((atd) obj).c;
            case Protos.Attaches.Attach.LOCATION:
                return fu7.r((psd) obj);
            case LangUtils.HASH_SEED:
                return ((ht) obj).o;
            case 18:
                List list = (List) obj;
                return list.isEmpty() ? hx7 : ax7.e((bud) list.get(0));
            case 19:
                return Long.valueOf(((xtd) obj).a);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                mud mud = (mud) obj;
                mud.getClass();
                return new y63(2, new g74(13, mud));
            case 21:
                List list2 = (List) obj;
                return list2.isEmpty() ? hx7 : ax7.e((bud) list2.get(0));
            case 22:
                cud cud = (cud) obj;
                long j = cud.a;
                ? obj2 = new Object();
                obj2.a = j;
                obj2.b = cud.b;
                obj2.c = cud.c;
                obj2.d = cud.d;
                obj2.e = cud.e;
                obj2.f = cud.f;
                obj2.g = cud.g;
                obj2.h = cud.h;
                obj2.i = cud.i;
                return new bud(obj2);
            case 23:
                List list3 = (List) obj;
                return list3.isEmpty() ? hx7 : ax7.e(list3);
            case 24:
                return ((OneMeRoomDatabase) obj).Q();
            default:
                bud bud = (bud) obj;
                ? obj3 = new Object();
                obj3.a = bud.a;
                obj3.b = bud.b;
                obj3.c = bud.c;
                obj3.d = bud.d;
                obj3.e = bud.e;
                obj3.f = bud.f;
                obj3.g = bud.g;
                obj3.h = bud.h;
                obj3.i = bud.i;
                return obj3;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return ((f2c) obj).a == r2c.STICKER;
            default:
                return ((ioa) obj).Y != 0;
        }
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                udd.s("zsd", "putSticker: failed", th);
                return;
            case 2:
                udd.s("zsd", "storeSections: failed", th);
                return;
            case 7:
                udd.s("zsd", "onStickersLoadedFromNetwork: write to stickers db failed", th);
                return;
            case 10:
                udd.s("zsd", "Can't update recents", th);
                return;
            case 11:
                udd.s("zsd", "load: failed", th);
                return;
            case Protos.Attaches.Attach.PRESENT:
                udd.s("zsd", "clear: failed to clear repository", th);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                udd.s("btd", "createSticker: failed", th);
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                udd.s("lud", "clear: repository clear failed", th);
                return;
            case 27:
                udd.s("k3e", "Got error during handling event", th);
                return;
            default:
                udd.s("k3e", "loadBotCommands: exception", th);
                return;
        }
    }
}
