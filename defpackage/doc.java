package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* renamed from: doc  reason: default package */
public final class doc implements boc {
    public final ReentrantLock X = new ReentrantLock(true);
    public final grd Y;
    public final grd Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public qod w0;
    public final r7e x0;
    public final grd y0;
    public final grd z0;

    public doc(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.o = t974;
        grd a2 = hrd.a(eoc.d);
        this.Y = a2;
        this.Z = a2;
        this.x0 = new r7e(new vfc(4));
        grd a3 = hrd.a((Object) null);
        this.y0 = a3;
        this.z0 = a3;
    }

    public final RecordManager b() {
        Conversation a2 = ((bt3) this.a.getValue()).a();
        if (a2 != null) {
            return a2.getRecordManager();
        }
        return null;
    }

    public final void c(foc foc) {
        grd grd;
        Object value;
        udd.P("ScreenRecordControllerTag", "release record state with " + foc, new Object[0]);
        do {
            grd = this.Y;
            value = grd.getValue();
            eoc eoc = (eoc) value;
        } while (!grd.b(value, eoc.a(eoc.d, foc, (aoc) null, false, 6)));
        qod qod = this.w0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.w0 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6 != 2) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.foc r18) {
        /*
            r17 = this;
            r0 = r17
        L_0x0002:
            grd r1 = r0.Y
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            eoc r3 = (defpackage.eoc) r3
            ru.ok.android.externcalls.sdk.record.RecordManager r4 = r17.b()
            r5 = 0
            if (r4 == 0) goto L_0x004e
            ru.ok.android.externcalls.sdk.record.RecordDescription r4 = r4.getRecordDescription()
            if (r4 == 0) goto L_0x004e
            m5c r6 = r4.getType()
            int r6 = r6.ordinal()
            r7 = 1
            if (r6 == 0) goto L_0x0028
            if (r6 == r7) goto L_0x002a
            r8 = 2
            if (r6 == r8) goto L_0x002b
        L_0x0028:
            r8 = r7
            goto L_0x002b
        L_0x002a:
            r8 = 3
        L_0x002b:
            if (r8 != r7) goto L_0x002e
            goto L_0x004e
        L_0x002e:
            aoc r5 = new aoc
            long r10 = r4.getMovieId()
            long r6 = r4.getMovieId()
            java.lang.String r12 = java.lang.String.valueOf(r6)
            ru.ok.android.externcalls.sdk.id.ParticipantId r6 = r4.getInitiator()
            le1 r13 = defpackage.xja.b(r6)
            long r14 = r4.getStart()
            r9 = r5
            r16 = r8
            r9.<init>(r10, r12, r13, r14, r16)
        L_0x004e:
            r4 = 4
            r6 = 0
            r7 = r18
            eoc r3 = defpackage.eoc.a(r3, r7, r5, r6, r4)
            boolean r1 = r1.b(r2, r3)
            if (r1 == 0) goto L_0x0002
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doc.d(foc):void");
    }

    public final void onRecordDataChanged() {
        udd.P("ScreenRecordControllerTag", "onRecordDataChanged", new Object[0]);
        d(foc.c);
    }

    public final void onRecordError(String str) {
        udd.P("ScreenRecordControllerTag", "onRecordError: " + str, new Object[0]);
        c(foc.b);
        c(foc.c);
    }

    public final void onRecordStarted() {
        RecordDescription recordDescription;
        RecordManager b2 = b();
        if (b2 != null && (recordDescription = b2.getRecordDescription()) != null) {
            udd.P("ScreenRecordControllerTag", "onRecordStarted: data = " + recordDescription, new Object[0]);
            long start = recordDescription.getStart();
            if (this.w0 == null) {
                this.w0 = xs7.E((ro1) this.b.getValue(), (hu3) null, (ru3) null, new coc(this, start, (Continuation) null), 3);
            }
            d(foc.a);
        }
    }

    public final void onRecordStopped(ConversationParticipant conversationParticipant) {
        ParticipantId externalId;
        ConversationParticipant me2;
        ParticipantId externalId2;
        udd.P("ScreenRecordControllerTag", "onRecordStopped: stoppedBy = " + conversationParticipant, new Object[0]);
        aoc aoc = ((eoc) this.Z.getValue()).b;
        le1 le1 = null;
        le1 le12 = aoc != null ? aoc.c : null;
        if (le12 != null) {
            Conversation a2 = ((bt3) this.a.getValue()).a();
            if (le12.equals((a2 == null || (me2 = a2.getMe()) == null || (externalId2 = me2.getExternalId()) == null) ? null : xja.b(externalId2))) {
                if (!(conversationParticipant == null || (externalId = conversationParticipant.getExternalId()) == null)) {
                    le1 = xja.b(externalId);
                }
                if (!le12.equals(le1)) {
                    ((py0) ((vx0) this.c.getValue())).C0.g(wa.a);
                }
            }
        }
        c(foc.c);
    }
}
