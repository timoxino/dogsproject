INSERT INTO dog (id, name, owner, description) VALUES
(1, 'Max', 'John Smith', 'A friendly golden retriever who loves to play fetch and swim. Great with kids and very energetic.'),
(2, 'Bella', 'Sarah Johnson', 'A gentle labrador who enjoys long walks and cuddling. Perfect family dog, well-trained and calm.'),
(3, 'Charlie', 'Mike Brown', 'An adventurous beagle with a great sense of smell. Loves exploring and is very curious about everything.')
ON CONFLICT (id) DO NOTHING;