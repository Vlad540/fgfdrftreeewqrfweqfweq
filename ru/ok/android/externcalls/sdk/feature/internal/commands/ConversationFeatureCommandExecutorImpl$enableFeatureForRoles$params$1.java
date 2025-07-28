package ru.ok.android.externcalls.sdk.feature.internal.commands;

import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ConversationFeatureCommandExecutorImpl$enableFeatureForRoles$params$1 extends b97 implements s16 {
    final /* synthetic */ e51 $feature;
    final /* synthetic */ Set<je1> $roles;
    final /* synthetic */ ConversationFeatureCommandExecutorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationFeatureCommandExecutorImpl$enableFeatureForRoles$params$1(ConversationFeatureCommandExecutorImpl conversationFeatureCommandExecutorImpl, e51 e51, Set<? extends je1> set) {
        super(0);
        this.this$0 = conversationFeatureCommandExecutorImpl;
        this.$feature = e51;
        this.$roles = set;
    }

    public final JSONObject invoke() {
        String str;
        String str2;
        g51 access$getParamsCreator$p = this.this$0.paramsCreator;
        e51 e51 = this.$feature;
        Set<je1> set = this.$roles;
        access$getParamsCreator$p.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "enable-feature-for-roles");
        int i = f51.$EnumSwitchMapping$0[e51.ordinal()];
        if (i == 1) {
            str = "ADD_PARTICIPANT";
        } else if (i == 2) {
            str = "RECORD";
        } else if (i == 3) {
            str = "MOVIE_SHARE";
        } else if (i == 4) {
            str = "ASR";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        jSONObject.put("feature", (Object) str);
        JSONArray jSONArray = new JSONArray();
        for (je1 ordinal : set) {
            int i2 = f51.$EnumSwitchMapping$1[ordinal.ordinal()];
            if (i2 == 1) {
                str2 = "CREATOR";
            } else if (i2 == 2) {
                str2 = "ADMIN";
            } else if (i2 == 3) {
                str2 = "SPEAKER";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            jSONArray.put((Object) str2);
        }
        jSONObject.put("roles", (Object) jSONArray);
        return jSONObject;
    }
}
