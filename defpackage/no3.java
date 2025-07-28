package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.tamtam.nano.Protos;

/* renamed from: no3  reason: default package */
public final /* synthetic */ class no3 implements of3, h67, mle, InternalIdsResolver.ParticipantPrivateStateModifier, ExternalIdsResolver.ParticipantPrivateStateModifier, kt0, e26, kh7, lh7 {
    public final /* synthetic */ int a;

    public /* synthetic */ no3(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                udd.s("oo3", "asyncUpdate: exception", (Throwable) obj);
                return;
            case 2:
                ConversationFactory.lambda$hangup$22(obj);
                return;
            default:
                ConversationFactory.lambda$hangup$23((Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 9:
                long j = ((xw3) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            default:
                return ws6.n(Integer.valueOf(((jy2) obj).a));
        }
    }

    public String c() {
        return ConversationFactory.lambda$joinAnonByLink$15();
    }

    public lt0 e(Bundle bundle) {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        boolean z;
        Bundle bundle2 = bundle;
        boolean z2 = false;
        CharSequence charSequence = bundle2.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle2.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle2.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle2.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (!bundle2.containsKey(Integer.toString(4, 36)) || !bundle2.containsKey(Integer.toString(5, 36))) {
            i = Integer.MIN_VALUE;
            f = -3.4028235E38f;
        } else {
            f = bundle2.getFloat(Integer.toString(4, 36));
            i = bundle2.getInt(Integer.toString(5, 36));
        }
        int i4 = bundle2.containsKey(Integer.toString(6, 36)) ? bundle2.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f3 = bundle2.containsKey(Integer.toString(7, 36)) ? bundle2.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i5 = bundle2.containsKey(Integer.toString(8, 36)) ? bundle2.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (!bundle2.containsKey(Integer.toString(10, 36)) || !bundle2.containsKey(Integer.toString(9, 36))) {
            i2 = Integer.MIN_VALUE;
            f2 = -3.4028235E38f;
        } else {
            float f4 = bundle2.getFloat(Integer.toString(10, 36));
            i2 = bundle2.getInt(Integer.toString(9, 36));
            f2 = f4;
        }
        float f5 = bundle2.containsKey(Integer.toString(11, 36)) ? bundle2.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f6 = bundle2.containsKey(Integer.toString(12, 36)) ? bundle2.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle2.containsKey(Integer.toString(13, 36))) {
            i3 = bundle2.getInt(Integer.toString(13, 36));
            z = true;
        } else {
            i3 = -16777216;
            z = false;
        }
        if (bundle2.getBoolean(Integer.toString(14, 36), false)) {
            z2 = z;
        }
        return new tw3(charSequence2, alignment2, alignment4, bitmap2, f, i, i4, f3, i5, i2, f2, f5, f6, z2, i3, bundle2.containsKey(Integer.toString(15, 36)) ? bundle2.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle2.containsKey(Integer.toString(16, 36)) ? bundle2.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 11:
                ((n35) obj).getClass();
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((n35) obj).getClass();
                return;
            case 13:
                ((hd) obj).getClass();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((n35) obj).getClass();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((n35) obj).getClass();
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                ((n35) obj).getClass();
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((n35) obj).getClass();
                return;
            case 18:
                ((hd) obj).getClass();
                return;
            case 19:
                ((n35) obj).getClass();
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                ((n35) obj).getClass();
                return;
            case 21:
                ((hd) obj).getClass();
                return;
            case 22:
                ((n35) obj).getClass();
                return;
            case 23:
                ((n35) obj).getClass();
                return;
            case 24:
                ((n35) obj).getClass();
                return;
            case 25:
                ((n35) obj).getClass();
                return;
            case 26:
                ((n35) obj).getClass();
                return;
            case 27:
                ((n35) obj).getClass();
                return;
            case 28:
                ((hd) obj).getClass();
                return;
            default:
                ((hd) obj).getClass();
                return;
        }
    }

    public Object parse(m67 m67) {
        switch (this.a) {
            case 1:
                return m67.z();
            default:
                return ConversationParams.parseCallParams(m67);
        }
    }

    public void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId) {
        conversationParticipant.setExternalId(participantId);
    }

    public void setInternalId(ConversationParticipant conversationParticipant, ge1 ge1) {
        conversationParticipant.setInternalId(ge1);
    }

    public /* synthetic */ no3(fd fdVar, int i, long j, long j2, int i2) {
        this.a = i2;
    }

    public /* synthetic */ no3(fd fdVar, vu5 vu5, p24 p24) {
        this.a = 12;
    }

    public /* synthetic */ no3(fd fdVar, String str, long j, long j2) {
        this.a = 11;
    }

    public /* synthetic */ no3(gd gdVar, long j) {
        this.a = 21;
    }

    public /* synthetic */ no3(gd gdVar, Exception exc) {
        this.a = 13;
    }
}
