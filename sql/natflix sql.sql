
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";



--
-- Database: `netflix`
--

-- --------------------------------------------------------

--
-- Table structure for table `content`
--

CREATE TABLE `content` (
  `id` int(11) NOT NULL,
  `title` varchar(256) NOT NULL,
  `type_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `summary` mediumtext NOT NULL,
  `logo_url` varchar(256) NOT NULL,
  `poster_url` varchar(256) NOT NULL,
  `banner_url` varchar(256) NOT NULL,
  `thumbnail_url` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `content`
--

INSERT INTO `content` (`id`, `title`, `type_id`, `category_id`, `summary`, `logo_url`, `poster_url`, `banner_url`, `thumbnail_url`) VALUES
(1, 'Seinfield', 1, 3, 'The show about nothing is a sitcom landmark, with comic Jerry and his three sardonic friends finding laughs in both the mundane and the ridiculous', '/fake-images/logos/1.png', '/fake-images/posters/1.png', '/fake-images/banners/1.png', '/fake-images/thumbnails/1.png'),
(2, 'Gundam II', 1, 1, 'Amet commodo nulla facilisi nullam vehicula ipsum. Sit amet luctus venenatis lectus magna fringilla urna. Felis bibendum ut tristique et egestas quis ipsum. ', '', '', '', '/fake-images/thumbnails/2.png'),
(3, 'Uncoupled', 1, 3, 'Ipsum dolor sit amet consectetur adipiscing elit ut. Id ornare arcu odio ut sem. Rhoncus dolor purus non enim. Id semper risus in hendrerit gravida rutrum quisque non.', '', '', '', '/fake-images/thumbnails/3.png'),
(4, 'Archer', 1, 3, 'Pellentesque habitant morbi tristique senectus et netus et malesuada fames. Mauris rhoncus aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque.', '', '', '', '/fake-images/thumbnails/4.png'),
(5, 'Ghost in the Shell SAC 2045', 1, 2, 'At erat pellentesque adipiscing commodo. Augue eget arcu dictum varius duis at. Massa sapien faucibus et molestie ac. Nam libero justo laoreet sit amet cursus sit amet. ', '', '', '', '/fake-images/thumbnails/5.png'),
(6, 'Cowboy Bebop', 1, 2, 'Tincidunt eget nullam non nisi est sit. Facilisis gravida neque convallis a cras. Non sodales neque sodales ut etiam sit amet nisl. Neque laoreet suspendisse interdum consectetur libero id.', '', '', '', '/fake-images/thumbnails/6.png'),
(7, 'Money Heist', 1, 2, 'Sem nulla pharetra diam sit amet nisl. Sed risus pretium quam vulputate. Massa tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada proin.', '', '', '', '/fake-images/thumbnails/7.png'),
(8, 'Narcos Mexico', 1, 4, 'Nisl rhoncus mattis rhoncus urna neque viverra. Sit amet volutpat consequat mauris nunc congue nisi vitae. Eget lorem dolor sed viverra ipsum nunc aliquet bibendum enim.', '', '', '', '/fake-images/thumbnails/8.png'),
(9, 'Gundam Char\'s Counter Attack', 1, 2, 'Tempus quam pellentesque nec nam aliquam. Viverra orci sagittis eu volutpat odio facilisis mauris sit amet. Quis blandit turpis cursus in. Posuere sollicitudin aliquam ultrices sagittis orci a scelerisque.', '', '', '', '/fake-images/thumbnails/9.png'),
(10, 'Neon Genesis Evangelion', 1, 2, 'Iaculis eu non diam phasellus vestibulum lorem sed risus. Nullam eget felis eget nunc lobortis mattis. Orci ac auctor augue mauris augue neque gravida.', '', '', '', '/fake-images/thumbnails/10.png'),
(11, 'Designated Survivor', 1, 4, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', '', '', '', '/fake-images/thumbnails/11.png'),
(12, 'Queen\'s Gambit', 1, 4, 'Amet commodo nulla facilisi nullam vehicula ipsum. Sit amet luctus venenatis lectus magna fringilla urna. Felis bibendum ut tristique et egestas quis ipsum. ', '', '', '', '/fake-images/thumbnails/12.png'),
(13, 'Community', 1, 3, 'Ipsum dolor sit amet consectetur adipiscing elit ut. Id ornare arcu odio ut sem. Rhoncus dolor purus non enim. Id semper risus in hendrerit gravida rutrum quisque non.', '', '', '', '/fake-images/thumbnails/13.png');

-- --------------------------------------------------------

--
-- Table structure for table `content_category`
--

CREATE TABLE `content_category` (
  `id` int(11) NOT NULL,
  `category` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `content_category`
--

INSERT INTO `content_category` (`id`, `category`) VALUES
(1, 'Horror'),
(2, 'Action'),
(3, 'Comedy'),
(4, 'Drama'),
(5, 'Other');

-- --------------------------------------------------------

--
-- Table structure for table `content_type`
--

CREATE TABLE `content_type` (
  `id` int(11) NOT NULL,
  `type` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `content_type`
--

INSERT INTO `content_type` (`id`, `type`) VALUES
(1, 'tv-series'),
(2, 'movie'),
(3, 'documentary');

-- --------------------------------------------------------

--
-- Table structure for table `details_content`
--

CREATE TABLE `details_content` (
  `content_id` int(11) NOT NULL,
  `vedio_code` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `details_content`
--

INSERT INTO `details_content` (`content_id`, `vedio_code`) VALUES
(1, 'FJUd2GhzCm0');

-- --------------------------------------------------------

--
-- Table structure for table `details_series`
--

CREATE TABLE `details_series` (
  `id` int(11) NOT NULL,
  `content_id` int(11) NOT NULL,
  `season_number` int(11) NOT NULL,
  `episode_number` int(11) NOT NULL,
  `title` varchar(256) NOT NULL,
  `summary` mediumtext NOT NULL,
  `thumbnail_url` varchar(256) NOT NULL,
  `vedio_code` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(256) NOT NULL,
  `email` varchar(256) NOT NULL,
  `hashed_password` varchar(256) NOT NULL,
  `type` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `content`
--
ALTER TABLE `content`
  ADD PRIMARY KEY (`id`),
  ADD KEY `type_id` (`type_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `content_category`
--
ALTER TABLE `content_category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `content_type`
--
ALTER TABLE `content_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `details_content`
--
ALTER TABLE `details_content`
  ADD PRIMARY KEY (`content_id`);

--
-- Indexes for table `details_series`
--
ALTER TABLE `details_series`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `details_series`
--
ALTER TABLE `details_series`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `content`
--
ALTER TABLE `content`
  ADD CONSTRAINT `content_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `content_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `content_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `content_category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `details_content`
--
ALTER TABLE `details_content`
  ADD CONSTRAINT `details_content_ibfk_1` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;