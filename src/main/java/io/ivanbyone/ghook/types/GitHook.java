/*
 * Copyright (c) 2026 Ivan Boyko.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package io.ivanbyone.ghook.types;

public enum GitHook {

    APPLYPATCH_MSG("applypatch-msg"),

    PRE_APPLYPATCH("pre-applypatch"),

    POST_APPLYPATCH("post-applypatch"),

    PRE_COMMIT("pre-commit"),

    PRE_MERGE_COMMIT("pre-merge-commit"),

    PREPARE_COMMIT_MSG("prepare-commit-msg"),

    COMMIT_MSG("commit-msg"),

    POST_COMMIT("post-commit"),

    PRE_REBASE("pre-rebase"),

    POST_CHECKOUT("post-checkout"),

    POST_MERGE("post-merge"),

    PRE_PUSH("pre-push"),

    PRE_RECEIVE("pre-receive"),

    UPDATE("update"),

    PROC_RECEIVE("proc-receive"),

    POST_RECEIVE("post-receive"),

    POST_UPDATE("post-update"),

    REFERENCE_TRANSACTION("reference-transaction"),

    PUSH_TO_CHECKOUT("push-to-checkout"),

    PRE_AUTO_GC("pre-auto-gc"),

    POST_REWRITE("post-rewrite"),

    SENDEMAIL_VALIDATE("sendemail-validate"),

    FSMONITOR_WATCHMAN("fsmonitor-watchman"),

    P4_CHANGELIST("p4-changelist"),

    P4_PREPARE_CHANGELIST("p4-prepare-changelist"),

    P4_POST_CHANGELIST("p4-post-changelist"),

    P$_PRE_SUBMIT("p4-pre-submit"),

    POST_INDEX_CHANGE("post-index-change");

    private final String name;

    GitHook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
