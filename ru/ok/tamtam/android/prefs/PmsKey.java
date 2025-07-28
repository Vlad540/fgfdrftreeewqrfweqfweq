package ru.ok.tamtam.android.prefs;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u0001\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\bj\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001¨\u0006\u0001"}, d2 = {"Lru/ok/tamtam/android/prefs/PmsKey;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "fullContentString$prefs_release", "fullContentString", "Companion", "xza", "set-unread-timeout", "proxy", "video-preview", "debug-mode", "proxy-domains", "image-width", "image-height", "image-quality", "image-size", "max-msg-length", "max-participants", "max-audio-length", "max-theme-length", "max-description-length", "edit-timeout", "chats-page-size", "keep-connection", "sticker-sections", "stickers-suggestion", "invite-link", "invite-short", "invite-long", "invite-header", "max-cname-length", "v-size-grp", "t-ice-reconnect", "file-upload-max-size", "file-upload-unsupported-types", "music-files-enabled", "chats-preload-period", "max-favorite-chats", "disconnect-timeout", "max-attach-count", "push-alert-timeout", "live-location-enabled", "live-location-release-date", "live-location-send-timeout", "support-account", "support-email", "wakelock-on-push", "mentions_entity_names_limit", "max-readmarks", "max-video-duration-download", "talking-on-muted-mic-trigger-diff", "max-favorite-stickers", "max-favorite-sticker-sets", "min-sticker-size", "max-sticker-size", "default-sticker-size", "min-image-side-size", "min-duration-save-audio-start-time", "valid-interval-audio-start-time", "min-duration-playback-speed", "drafts-sync-enabled", "audio-transcription-locales", "scheduled-messages-enabled", "tracer-non-fatal-crashed-enabled", "subscription-timeout-seconds", "double-tap-reaction", "reactions-max", "react-errors", "msg-get-reactions-page-size", "wm-workers-limit", "wm-check-workers-count-interval-sec", "wm-backlog-worker-check-delay-sec", "wm-backlog-worker-backoff-delay-sec", "wm-workers-offset", "wm-analytics-enabled", "progress-diff-for-notify", "worker-progress-time-diff-for-notify-ms", "max-downloaded-size-for-notify-kb", "fb-exec-replace", "fb-exec-modifiers-names", "log-full", "log-sensitive", "anr-config", "debug-profile-info", "calls-endpoint", "fake-chats", "channels-enabled", "available-complaints", "in-app-review-triggers", "fake-in-app-review", "welcome-sticker-ids", "money-transfer-botid", "non-contact-sync-time", "non-contact-max-chunk-size", "non-contact-collection-interval", "edit-chat-type-screen-enabled", "gce", "lgce", "sse", "gsse", "grse", "gcas", "gcwr", "gcmpe", "account-nickname-enabled", "send-location-enabled", "reconnect-call-ringtone", "new-media-viewer-enabled", "media-viewer-video-collage-enabled", "new-uploader-enabled", "mytracker-enabled", "chat-video-autoplay-parallel-count", "chat-complaint-enabled", "bot-complaint-enabled", "calls-sdk-audio-dynamic-redundancy", "conn-timeouts", "safe-mode-enabled", "media-transform", "max-rate-call-threshold", "call-minimum-duration-to-rate", "call-rate", "send-queue-size", "webapp-ds-keys-count", "webapp-ss-keys-count", "webapp-biometry-enabled", "ext-sharing-video", "chat-invite-link-permissions-enabled", "chat-animoji-enabled", "edit-channel-type-screen-enabled", "chat-anim", "send-logs-interval-sec", "saved-messages-enabled", "saved-messages-aliases", "video-msg-enabled", "analytics-permissions", "stat-session-background-threshold", "bot-start-param", "js-download-delegate", "esia-enabled", "new-admin-permissions", "media-order", "bad-networ-indicator-config", "webm-stickers-enabled", "avatars-screen-enabled", "new-session-logic", "analytics-enabled", "mytracker-log-level", "show-vpn-snackbar", "search-webapps-showcase", "player-load-control", "prefs_release"}, k = 1, mv = {2, 0, 0})
@Keep
public enum PmsKey {
    f106setunreadtimeout,
    proxy,
    f120videopreview,
    f24debugmode,
    f93proxydomains,
    f44imagewidth,
    f41imageheight,
    f42imagequality,
    f43imagesize,
    f65maxmsglength,
    f66maxparticipants,
    f58maxaudiolength,
    f70maxthemelength,
    f60maxdescriptionlength,
    f32edittimeout,
    f21chatspagesize,
    f51keepconnection,
    f109stickersections,
    f110stickerssuggestion,
    f47invitelink,
    f49inviteshort,
    f48invitelong,
    f46inviteheader,
    f59maxcnamelength,
    f117vsizegrp,
    f114ticereconnect,
    f39fileuploadmaxsize,
    f40fileuploadunsupportedtypes,
    f81musicfilesenabled,
    f22chatspreloadperiod,
    f62maxfavoritechats,
    f27disconnecttimeout,
    f57maxattachcount,
    f94pushalerttimeout,
    f52livelocationenabled,
    f53livelocationreleasedate,
    f54livelocationsendtimeout,
    f112supportaccount,
    f113supportemail,
    f121wakelockonpush,
    mentions_entity_names_limit,
    f68maxreadmarks,
    f71maxvideodurationdownload,
    f115talkingonmutedmictriggerdiff,
    f64maxfavoritestickers,
    f63maxfavoritestickersets,
    f78minstickersize,
    f69maxstickersize,
    f26defaultstickersize,
    f77minimagesidesize,
    f76mindurationsaveaudiostarttime,
    f118validintervalaudiostarttime,
    f75mindurationplaybackspeed,
    f29draftssyncenabled,
    f5audiotranscriptionlocales,
    f101scheduledmessagesenabled,
    f116tracernonfatalcrashedenabled,
    f111subscriptiontimeoutseconds,
    f28doubletapreaction,
    f96reactionsmax,
    f95reacterrors,
    f80msggetreactionspagesize,
    f131wmworkerslimit,
    f130wmcheckworkerscountintervalsec,
    f129wmbacklogworkercheckdelaysec,
    f128wmbacklogworkerbackoffdelaysec,
    f132wmworkersoffset,
    f127wmanalyticsenabled,
    f92progressdifffornotify,
    f133workerprogresstimedifffornotifyms,
    f61maxdownloadedsizefornotifykb,
    f38fbexecreplace,
    f37fbexecmodifiersnames,
    f55logfull,
    f56logsensitive,
    f4anrconfig,
    f25debugprofileinfo,
    f13callsendpoint,
    f35fakechats,
    f15channelsenabled,
    f6availablecomplaints,
    f45inappreviewtriggers,
    f36fakeinappreview,
    f126welcomestickerids,
    f79moneytransferbotid,
    f90noncontactsynctime,
    f89noncontactmaxchunksize,
    f88noncontactcollectioninterval,
    f31editchattypescreenenabled,
    gce,
    lgce,
    sse,
    gsse,
    grse,
    gcas,
    gcwr,
    gcmpe,
    f1accountnicknameenabled,
    f103sendlocationenabled,
    f97reconnectcallringtone,
    f85newmediaviewerenabled,
    f74mediaviewervideocollageenabled,
    f87newuploaderenabled,
    f82mytrackerenabled,
    f20chatvideoautoplayparallelcount,
    f18chatcomplaintenabled,
    f9botcomplaintenabled,
    f14callssdkaudiodynamicredundancy,
    f23conntimeouts,
    f98safemodeenabled,
    f73mediatransform,
    f67maxratecallthreshold,
    f11callminimumdurationtorate,
    f12callrate,
    f105sendqueuesize,
    f123webappdskeyscount,
    f124webappsskeyscount,
    f122webappbiometryenabled,
    f34extsharingvideo,
    f19chatinvitelinkpermissionsenabled,
    f17chatanimojienabled,
    f30editchanneltypescreenenabled,
    f16chatanim,
    f104sendlogsintervalsec,
    f100savedmessagesenabled,
    f99savedmessagesaliases,
    f119videomsgenabled,
    f3analyticspermissions,
    f108statsessionbackgroundthreshold,
    f10botstartparam,
    f50jsdownloaddelegate,
    f33esiaenabled,
    f84newadminpermissions,
    f72mediaorder,
    f8badnetworindicatorconfig,
    f125webmstickersenabled,
    f7avatarsscreenenabled,
    f86newsessionlogic,
    f2analyticsenabled,
    f83mytrackerloglevel,
    f107showvpnsnackbar,
    f102searchwebappsshowcase,
    f91playerloadcontrol;
    
    public static final xza Companion = null;
    /* access modifiers changed from: private */
    public static final t97 keys$delegate = null;

    /* JADX WARNING: type inference failed for: r0v144, types: [java.lang.Object, xza] */
    static {
        PmsKey[] $values;
        $ENTRIES = new pz4($values);
        Companion = new Object();
        keys$delegate = new r7e(new qga(19));
    }

    public static oz4 getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: private */
    public static final Map keys_delegate$lambda$1() {
        oz4 entries = getEntries();
        int S = ju7.S(q23.H(entries, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        for (Object next : entries) {
            linkedHashMap.put(((PmsKey) next).name(), next);
        }
        return linkedHashMap;
    }

    public final String fullContentString$prefs_release() {
        return wn6.i("\"", name(), "\"");
    }

    public String toString() {
        return name();
    }
}
