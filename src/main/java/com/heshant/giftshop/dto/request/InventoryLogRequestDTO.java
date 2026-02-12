package com.heshant.giftshop.dto.request;

public record InventoryLogRequestDTO(Integer productId, Integer changeAmount, String reason) {}