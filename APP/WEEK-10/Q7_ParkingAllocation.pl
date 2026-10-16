% slot(SlotID, VehicleType, Availability).
slot(s1, car, available).
slot(s2, bike, occupied).
slot(s3, car, available).
slot(s4, bike, available).
slot(s5, car, occupied).

% Find available slots for a particular vehicle type.
available_slot(SlotID, VehicleType) :-
    slot(SlotID, VehicleType, available).

% Query for available car parking slots:
% ?- available_slot(SlotID, car).
% Expected results: SlotID = s1 ; SlotID = s3.
