package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* renamed from: ly0  reason: default package */
public final class ly0 implements ConversationFeatureManager.FeatureListener {
    public final /* synthetic */ py0 a;

    public ly0(py0 py0) {
        this.a = py0;
    }

    public final void onFeatureEnabledChanged(e51 e51, boolean z) {
        Object value;
        ly0.super.onFeatureEnabledChanged(e51, z);
        if (e51 == e51.b) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, "CallAdminSettingsController", us8.k("Record in call was changed for me to ", z), (Throwable) null);
            }
            grd grd = this.a.E0;
            do {
                value = grd.getValue();
            } while (!grd.b(value, ea.a((ea) value, false, false, false, false, z, false, 111)));
        }
    }

    public final void onFeatureRolesChanged(e51 e51, FeatureRoles featureRoles) {
        Object value;
        ly0.super.onFeatureRolesChanged(e51, featureRoles);
        if (e51 == e51.b) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, "CallAdminSettingsController", "Record in call was changed for role=" + featureRoles, (Throwable) null);
            }
            boolean z = featureRoles instanceof FeatureRoles.EnabledForAll;
            grd grd = this.a.E0;
            do {
                value = grd.getValue();
            } while (!grd.b(value, ea.a((ea) value, false, false, false, false, z, false, 111)));
            Conversation a2 = this.a.d().a();
            if (a2 != null ? a2.isMeCreatorOrAdmin() : false) {
                this.a.C0.g(new db(z));
            }
        }
    }
}
