package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g95  reason: default package */
public final /* synthetic */ class g95 implements of3, j26, cr3, v1b {
    public final /* synthetic */ int a;

    public /* synthetic */ g95(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                udd.p("l95", "on next favorite ids to subject: %s", new Object[]{(List) obj});
                return;
            case 1:
                udd.s("l95", "load: failed", (Throwable) obj);
                return;
            case 2:
                udd.s("l95", "onAssetsUpdate: failed to store fav sticker sets", (Throwable) obj);
                return;
            case 3:
                udd.s("l95", "setFavoriteStickerSetMoved: failed", (Throwable) obj);
                return;
            case 6:
                udd.s("l95", "clear: failed to clear fav stickers repository", (Throwable) obj);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                udd.s("fa5", "failed favorites obs", (Throwable) obj);
                return;
            case 21:
                udd.p("fa5", "on next favorite sticker ids to subject: %s", new Object[]{(List) obj});
                return;
            case 22:
                udd.s("fa5", "load stickers: failed", (Throwable) obj);
                return;
            default:
                udd.s("fa5", "clear: failed to clear repository", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        c73 c73 = c73.a;
        switch (this.a) {
            case 4:
                return new phd(((p95) obj).a(), new g95(10), 0);
            case 5:
                return new w63(((p95) obj).a(), 2, new g95(8));
            case 7:
                return ((q95) obj).a;
            case 8:
                y95 y95 = (y95) obj;
                y95.getClass();
                return new y63(2, new g74(2, y95));
            case 9:
                return ((OneMeRoomDatabase) obj).A();
            case 10:
                y95 y952 = (y95) obj;
                Objects.requireNonNull(y952);
                return new mv9(2, new n95(y952, 0));
            case 11:
                y95 y953 = (y95) obj;
                Objects.requireNonNull(y953);
                return new mv9(2, new n95(y953, 1));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                y95 y954 = (y95) obj;
                y954.getClass();
                uh uhVar = new uh(y954, 6, pec.a(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC"));
                return js.g(y954.a, new String[]{"favorite_sticker_sets"}, uhVar);
            case 13:
                kt ktVar = (kt) obj;
                return new q95(ktVar.Y, ktVar.o);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ft ftVar = (ft) obj;
                return c73;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                qt qtVar = (qt) obj;
                return c73;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                tt ttVar = (tt) obj;
                return c73;
            case LangUtils.HASH_SEED /*17*/:
                kt ktVar2 = (kt) obj;
                return new z95(ktVar2.Y, ktVar2.c);
            case 18:
                tt ttVar2 = (tt) obj;
                return c73;
            case 19:
                ft ftVar2 = (ft) obj;
                return c73;
            case 24:
                return new ArrayList((List) obj);
            case 25:
                return ((z95) obj).a;
            default:
                return ((xm8) obj).a.D0.x(j10.y0);
        }
    }

    public Object l(Task task) {
        switch (this.a) {
            case 26:
                return Integer.valueOf(HttpStatus.SC_FORBIDDEN);
            default:
                return -1;
        }
    }

    public boolean test(Object obj) {
        return ((sna) obj).a == 167;
    }
}
