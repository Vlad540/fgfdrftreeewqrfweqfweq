package defpackage;

import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.EglThread;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: i74  reason: default package */
public final /* synthetic */ class i74 implements j26, e26, kt0, i83, otc, of3, ko4, lo4, EglThread.ReleaseMonitor, lh7, kh7 {
    public final /* synthetic */ int a;

    public /* synthetic */ i74(int i) {
        this.a = i;
    }

    private final void b() {
    }

    private final void c() {
    }

    public Constructor a() {
        Class<e75> cls = e75.class;
        switch (this.a) {
            case 1:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(cls).getConstructor(new Class[]{Integer.TYPE});
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(cls).getConstructor((Class[]) null);
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                ((m00) obj).m = "";
                return;
            case 11:
                udd.s("mu4", "Can't invalidate", (Throwable) obj);
                return;
            default:
                udd.s("l95", "failed favorites obs", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((OneMeRoomDatabase) obj).y();
            case 3:
                woe woe = (woe) obj;
                woe.getClass();
                Bundle bundle = new Bundle();
                e8c e8c = woe.b;
                ArrayList arrayList = new ArrayList(e8c.o);
                po5 l = e8c.l(0);
                while (l.hasNext()) {
                    arrayList.add(((uoe) l.next()).f());
                }
                bundle.putParcelableArrayList(woe.e, arrayList);
                return bundle;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return new f44((y7e) obj);
            case LangUtils.HASH_SEED /*17*/:
                return new g44((z7e) obj);
            case 22:
                ha5 ha5 = (ha5) obj;
                ha5.getClass();
                return new y63(2, new g74(3, ha5));
            case 23:
                ha5 ha52 = (ha5) obj;
                Objects.requireNonNull(ha52);
                return new mv9(2, new w85(ha52, 0));
            case 24:
                return ((OneMeRoomDatabase) obj).B();
            case 25:
                ha5 ha53 = (ha5) obj;
                Objects.requireNonNull(ha53);
                return new mv9(2, new w85(ha53, 1));
            case 26:
                ha5 ha54 = (ha5) obj;
                ha54.getClass();
                uh uhVar = new uh(ha54, 7, pec.a(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC"));
                return js.g(ha54.a, new String[]{"favorite_stickers"}, uhVar);
            case 27:
                return new phd(((p95) obj).a(), new g95(11), 0);
            default:
                return new lx7(((p95) obj).a(), new g95(12), 3);
        }
    }

    public lt0 e(Bundle bundle) {
        boolean z = false;
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i2 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i >= 0 && i2 >= 0) {
            z = true;
        }
        swb.e(z);
        intArray.getClass();
        return new pb4(i, i2, intArray);
    }

    public Object h(uwb uwb) {
        switch (this.a) {
            case 5:
                Set b = uwb.b(pjb.a(u90.class));
                ea6 ea6 = ea6.c;
                if (ea6 == null) {
                    synchronized (ea6.class) {
                        try {
                            ea6 = ea6.c;
                            if (ea6 == null) {
                                ea6 = new ea6(0);
                                ea6.c = ea6;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return new dc4(b, ea6);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return ExecutorsRegistrar.g(uwb);
            case 13:
                return ExecutorsRegistrar.e(uwb);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ExecutorsRegistrar.a(uwb);
            default:
                return ExecutorsRegistrar.d(uwb);
        }
    }

    public int i(int i) {
        k77[] k77Arr = DialogNotificationsSettingsScreen.Y;
        return 4;
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 18:
                ((hya) obj).x0(new ExoPlaybackException(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 19:
                ((gya) obj).p();
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                ((gya) obj).getClass();
                return;
            default:
                ((hya) obj).i0();
                return;
        }
    }

    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    public void release() {
        int i = this.a;
    }
}
