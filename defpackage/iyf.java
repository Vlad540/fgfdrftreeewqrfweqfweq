package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iyf  reason: default package */
public final class iyf {
    public final boolean a;
    public final List b;
    public final boolean c;

    public iyf(ArrayList arrayList, boolean z, boolean z2) {
        this.a = z;
        this.b = arrayList;
        this.c = z2;
    }

    public final String toString() {
        return "HandleConversationParticipantsResult{isMeRestricted=" + this.a + ", responders=" + this.b + ", callToGroup=" + this.c + '}';
    }
}
