package com.inspiredlabs.onetenantperdb.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class TenantContext {
    private TenantContext(){

    }

    private static InheritableThreadLocal<String> currentTenant = new InheritableThreadLocal<>();
}
