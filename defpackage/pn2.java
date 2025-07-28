package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: pn2  reason: default package */
public final class pn2 extends ibe {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn2(dfa dfa, int i) {
        super(dfa);
        this.o = i;
    }

    public short N() {
        switch (this.o) {
            case 0:
                return dfa.CHAT_SEARCH_COMMON_PARTICIPANTS.a;
            case 1:
                jk9 jk9 = dfa.c;
                return 75;
            case 2:
                jk9 jk92 = dfa.c;
                return 55;
            case 3:
                jk9 jk93 = dfa.c;
                return 53;
            case 4:
                jk9 jk94 = dfa.c;
                return 22;
            case 7:
                jk9 jk95 = dfa.c;
                return 36;
            case 8:
                jk9 jk96 = dfa.c;
                return 39;
            case 9:
                jk9 jk97 = dfa.c;
                return 35;
            case 10:
                jk9 jk98 = dfa.c;
                return 34;
            case 11:
                return dfa.DRAFT_DISCARD.a;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return dfa.DRAFT_SAVE.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                jk9 jk99 = dfa.c;
                return 88;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                jk9 jk910 = dfa.c;
                return 87;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                jk9 jk911 = dfa.c;
                return 124;
            case LangUtils.HASH_SEED:
                jk9 jk912 = dfa.c;
                return 179;
            case 21:
                jk9 jk913 = dfa.c;
                return 71;
            case 22:
                jk9 jk914 = dfa.c;
                return 181;
            case 24:
                jk9 jk915 = dfa.c;
                return 178;
            case 25:
                jk9 jk916 = dfa.c;
                return 73;
            case 26:
                jk9 jk917 = dfa.c;
                return 72;
            case 27:
                jk9 jk918 = dfa.c;
                return 118;
            case 29:
                jk9 jk919 = dfa.c;
                return 70;
            default:
                return super.N();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2() {
        super((dfa) null);
        this.o = 15;
        g(1, "count");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2(long j, int i) {
        super((dfa) null);
        this.o = 8;
        n(j, "contactId");
        g(50, "count");
        if (i != 0) {
            g(i, "from");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2(long j, int i, byte b) {
        super((dfa) null);
        this.o = i;
        switch (i) {
            case 26:
                super((dfa) null);
                if (j != 0) {
                    n(j, ApiProtocol.PARAM_CHAT_ID);
                    return;
                }
                return;
            default:
                n(j, "fileId");
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2(long j, int i, String str, boolean z, String str2, HashMap hashMap, String str3, String str4, d10 d10, Long l, boolean z2, long j2) {
        super((dfa) null);
        String str5;
        this.o = 2;
        n(j, ApiProtocol.PARAM_CHAT_ID);
        if (i != 0) {
            if (i == 1) {
                str5 = "UNKNOWN";
            } else if (i == 2) {
                str5 = "PUBLIC";
            } else if (i == 3) {
                str5 = "PRIVATE";
            } else {
                throw null;
            }
            s("access", str5);
        }
        if (!r1g.p(str)) {
            s("link", str);
        }
        if (z) {
            d("revokePrivateLink", true);
        }
        if (str2 != null) {
            s("description", str2);
        }
        if (hashMap != null && hashMap.size() > 0) {
            p("options", hashMap);
        }
        if (str3 != null) {
            s("theme", str3);
        }
        if (str4 != null) {
            s("photoToken", str4);
        }
        if (d10 != null) {
            p("crop", d10.a());
        }
        if (l != null) {
            ((HashMap) this.b).put("pinMessageId", l);
            if (z2) {
                d("notifyPin", true);
            }
        }
        if (j2 != 0) {
            n(j2, "changeOwnerId");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2(long j, List list) {
        super((dfa) null);
        this.o = 21;
        n(j, ApiProtocol.PARAM_CHAT_ID);
        h("messageIds", list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2(String str, long j, ra3 ra3, boolean z) {
        super((dfa) null);
        this.o = 4;
        Map map = null;
        if (!r1g.p(str)) {
            s("pushToken", str);
        }
        if (j > 0) {
            n(j, "pushOptions");
        }
        if (ra3 != null) {
            kgd kgd = new kgd(4);
            String str2 = ra3.a;
            if (str2 != null) {
                kgd.put("hash", str2);
            }
            Map map2 = ra3.c;
            if (map2 != null) {
                map = map2.isEmpty() ^ true ? map2 : map;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(ju7.S(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        tn2 tn2 = (tn2) entry.getValue();
                        tn2.getClass();
                        kgd kgd2 = new kgd(0);
                        kgd2.put("dontDisturbUntil", Long.valueOf(tn2.b));
                        Long l = tn2.c;
                        if (l != null) {
                            kgd2.put("favIndex", l);
                        }
                        List list = tn2.a;
                        if (list == null || list.isEmpty()) {
                            Boolean bool = Boolean.FALSE;
                            kgd2.put("sound", bool);
                            kgd2.put("vibr", bool);
                            kgd2.put("led", bool);
                        } else {
                            kgd2.put("sound", Boolean.valueOf(list.contains(mj2.SOUND)));
                            kgd2.put("vibr", Boolean.valueOf(list.contains(mj2.VIBRATION)));
                            kgd2.put("led", Boolean.valueOf(list.contains(mj2.LED)));
                        }
                        linkedHashMap.put(key, kgd2);
                    }
                    kgd.put("chats", linkedHashMap);
                }
            }
            gze gze = ra3.d;
            if (gze != null) {
                kgd kgd3 = new kgd(0);
                Boolean bool2 = gze.a;
                if (bool2 != null) {
                    kgd3.put("PUSH_NEW_CONTACTS", bool2);
                }
                Long l2 = gze.b;
                if (l2 != null) {
                    kgd3.put("DONT_DISTURB_UNTIL", l2);
                }
                String str3 = gze.c;
                if (str3 != null) {
                    kgd3.put("DIALOGS_PUSH_NOTIFICATION", str3);
                }
                String str4 = gze.d;
                if (str4 != null) {
                    kgd3.put("CHATS_PUSH_NOTIFICATION", str4);
                }
                String str5 = gze.e;
                if (str5 != null) {
                    kgd3.put("PUSH_SOUND", str5);
                }
                String str6 = gze.f;
                if (str6 != null) {
                    kgd3.put("DIALOGS_PUSH_SOUND", str6);
                }
                String str7 = gze.g;
                if (str7 != null) {
                    kgd3.put("CHATS_PUSH_SOUND", str7);
                }
                Boolean bool3 = gze.h;
                if (bool3 != null) {
                    kgd3.put("HIDDEN", bool3);
                }
                Integer num = gze.i;
                if (num != null) {
                    kgd3.put("LED", num);
                }
                Integer num2 = gze.j;
                if (num2 != null) {
                    kgd3.put("DIALOGS_LED", num2);
                }
                Integer num3 = gze.k;
                if (num3 != null) {
                    kgd3.put("CHATS_LED", num3);
                }
                Boolean bool4 = gze.l;
                if (bool4 != null) {
                    kgd3.put("VIBR", bool4);
                }
                Boolean bool5 = gze.m;
                if (bool5 != null) {
                    kgd3.put("DIALOGS_VIBR", bool5);
                }
                Boolean bool6 = gze.n;
                if (bool6 != null) {
                    kgd3.put("CHATS_VIBR", bool6);
                }
                int i = gze.p;
                if (i != 0) {
                    kgd3.put("INCOMING_CALL", sxe.k(i));
                }
                int i2 = gze.o;
                if (i2 != 0) {
                    kgd3.put("CHATS_INVITE", sxe.k(i2));
                }
                fze fze = gze.q;
                if (fze != null) {
                    kgd3.put("INACTIVE_TTL", fze.a);
                }
                int i3 = gze.r;
                if (i3 != 0) {
                    kgd3.put("M_CALL_PUSH_NOTIFICATION", sxe.j(i3));
                }
                int i4 = gze.s;
                if (i4 != 0) {
                    kgd3.put("SUGGEST_STICKERS", sxe.l(i4));
                }
                Boolean bool7 = gze.t;
                if (bool7 != null) {
                    kgd3.put("AUDIO_TRANSCRIPTION_ENABLED", bool7);
                }
                Boolean bool8 = gze.u;
                if (bool8 != null) {
                    kgd3.put("SAFE_MODE", bool8);
                }
                int i5 = gze.v;
                if (i5 != 0) {
                    kgd3.put("SEARCH_BY_PHONE", sxe.k(i5));
                }
                kgd.put("user", kgd3);
            }
            u72 u72 = ra3.e;
            if (u72 != null) {
                kgd.put("chatFolders", jjd.h(new wia[]{new wia("ALL_FILTER_EXCLUDE", o23.s0(u72.a)), new wia("FOLDERS", o23.s0(u72.b))}));
            }
            p("settings", kgd);
        }
        if (z) {
            d("reset", z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2(long j, long j2, String str, zy zyVar, ArrayList arrayList, nd4 nd4) {
        super(dfa.MSG_EDIT);
        this.o = 20;
        n(j, ApiProtocol.PARAM_CHAT_ID);
        n(j2, "messageId");
        if (str != null) {
            s("text", str);
        }
        if (zyVar != null) {
            h("attachments", zyVar);
        }
        if (arrayList != null) {
            h("elements", arrayList);
        }
        if (nd4 != null) {
            p("delayedAttributes", nd4.a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2(long[] jArr) {
        super(dfa.CONTACT_INFO);
        this.o = 6;
        i("contactIds", jArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pn2(long j, long j2, xga xga, Boolean bool, long j3) {
        super(dfa.MSG_SEND);
        this.o = 28;
        if (j != 0) {
            n(j, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j2 != 0) {
            n(j2, "userId");
        }
        p("message", xga.a());
        if (bool != null) {
            ((HashMap) this.b).put("notify", bool);
        }
        if (j3 != 0) {
            n(j3, "lastKnownDraftTime");
        }
    }
}
