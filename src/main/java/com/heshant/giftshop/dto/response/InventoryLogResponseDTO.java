package com.heshant.giftshop.dto.response;

import java.time.LocalDateTime;

public record InventoryLogResponseDTO(Integer id, Integer changeAmount, String reason, LocalDateTime createdAt) {}
